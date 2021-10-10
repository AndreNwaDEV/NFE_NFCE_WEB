package br.com.swconsultoria.nfe.util;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 26/05/2019 - 12:38
 */
class XmlNfeUtilTest {

    @Test
    void leXmlCorreto() throws IOException {
        String xml = XmlNfeUtil.leXml("src/test/resources/TesteLeXml.xml");
        assertEquals("<teste>\n    <tag>123</tag>\n</teste>", xml);
    }

    @Test
    void leXmlArquivoNaoExiste() {
        String arquivo = "TesteLeXml.xml";
        FileNotFoundException exception = assertThrows(FileNotFoundException.class, () -> {
            String xml = XmlNfeUtil.leXml(arquivo);
        });
        assertEquals(exception.getMessage(), "Arquivo "+arquivo+" não encontrado.");
    }

    @Test
    void leXmlParametroVazioNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            String xml = XmlNfeUtil.leXml(null);
        });
        assertEquals(exception.getMessage(), "Arquivo xml não pode ser nulo/vazio.");

        exception = assertThrows(IllegalArgumentException.class, () -> {
            String xml = XmlNfeUtil.leXml("");
        });
        assertEquals(exception.getMessage(), "Arquivo xml não pode ser nulo/vazio.");
    }

    @Test
    void geraHashCSRTSucesso() throws NoSuchAlgorithmException {
        String chave = "41180678393592000146558900000006041028190697";
        String csrt = "G8063VRTNDMO886SFNK5LDUDEI24XJ22YIPO";

        assertArrayEquals("aWv6LeEM4X6u4+qBI2OYZ8grigw=".getBytes(StandardCharsets.UTF_8),XmlNfeUtil.geraHashCSRT(chave,csrt));
    }

    @Test
    void geraHashCSRTParametrosInvalidos() {
        String chave = "41180678393592000146558900000006041028190697";
        String csrt = "G8063VRTNDMO886SFNK5LDUDEI24XJ22YIPO";

        //Chave Nula
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            XmlNfeUtil.geraHashCSRT(null,csrt)
        );
        assertEquals(exception.getMessage(), "Chave não deve ser nula ou vazia");

        //Chave Com menos Caracteres
        exception = assertThrows(IllegalArgumentException.class, () ->
            XmlNfeUtil.geraHashCSRT("123",csrt)
        );
        assertEquals(exception.getMessage(), "Chave deve conter 44 caracteres.");

        //CSRC Vazio
        exception = assertThrows(IllegalArgumentException.class, () ->
            XmlNfeUtil.geraHashCSRT(chave,"")
        );
        assertEquals(exception.getMessage(), "CSRT não deve ser nulo ou vazio");
    }

}