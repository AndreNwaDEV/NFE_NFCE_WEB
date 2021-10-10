# Java-NFe [![Build Status](https://travis-ci.org/Samuel-Oliveira/Java_NFe.svg?branch=master)](https://travis-ci.org/Samuel-Oliveira/Java_NFe) [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java_NFe.svg) ](https://github.com/Samuel-Oliveira/Java_NFe/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-nfe.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-nfe/4.00.17/jar) [![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/Samuel-Oliveira/Java_NFe.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/Samuel-Oliveira/Java_NFe/context:java) [![Total alerts](https://img.shields.io/lgtm/alerts/g/Samuel-Oliveira/Java_NFe.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/Samuel-Oliveira/Java_NFe/alerts/)
Biblioteca Java para consumo do WebService de NFe/NFCe

## Dúvidas, Sugestões ou Consultoria
Entre no Discord do Projeto: https://discord.gg/ZXpqnaV

## Gostou do Projeto? Dê sua colaboração pelo Pix: 01713390108 <img src="https://swconsultoria.com.br/pix.png" width="200">

Para Iniciar : 
- Caso use Libs baixe o java-nfe-4.00.17.jar (https://github.com/Samuel-Oliveira/Java_NFe/raw/master/java-nfe-4.00.17.jar) e o adicione às bibliotecas de Seu Projeto.

- Baixe o Schemas.rar (https://github.com/Samuel-Oliveira/Java_NFe/raw/master/schemas.zip) e extraia na sua Máquina.

- Maven :
```xml
<dependency>
    <groupId>br.com.swconsultoria</groupId>
    <artifactId>java-nfe</artifactId>
    <version>4.00.17</version>
</dependency>
```

- Gradle :
```groovy
repositories {
    maven { 
        url = "https://oss.sonatype.org/content/repositories/snapshots" 
    }
}
dependencies {
    implementation "br.com.swconsultoria:java-nfe:4.00.17"
}
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java_NFe/wiki, para ter um Tutorial Completo.

________________________________________________________________________________________________

# Historico de Versões
[comment]: <> (## v4.00.17 - SNAPSHOT - 02/08/2021 - Schemas PL.009f)
[comment]: <> (- Correção de SOAP)
[comment]: <> (Snapshot é a versão que se encontra em teste, só use em caso de extrema necessidade.)
[comment]: <> (Para usar, adicione o repositorio de Snapshot ao Maven:)
[comment]: <> (```)
[comment]: <> (<repositories>)
[comment]: <> (    <repository>)
[comment]: <> (        <id>sonatype-nexus-snapshots</id>)
[comment]: <> (        <url>https://oss.sonatype.org/content/repositories/snapshots</url>)
[comment]: <> (    </repository>)
[comment]: <> (</repositories>)
[comment]: <> (<dependency>)
[comment]: <> (    <groupId>br.com.swconsultoria</groupId>)
[comment]: <> (    <artifactId>java-nfe</artifactId>)
[comment]: <> (    <version>4.00.17-SNAPSHOT</version>)
[comment]: <> (</dependency>)
[comment]: <> (```)
[comment]: <> (Ou baixe o Jar aqui: https://github.com/Samuel-Oliveira/Java_NFe/raw/master/java-nfe-4.00.17-SNAPSHOT.jar)

## v4.00.17 - 09/08/2021 - Schemas PL.009f
- Correção de Schemas
- Atualizado Cacert
- Rollback das modificações Maven (Deu Ruim)
- Correção de SOAP

## v4.00.16 - 01/08/2021 - Schemas PL.009f
- Correção de vunerabilidades Maven
- Correção Acentuação
- Atualizado Lib Certificado
- Atualizado Cacert
- Corrigido URL NFCe SC

## v4.00.15 - 28/06/2021 - Versão Schemas PL.009f
- Removido Cacert do Projeto, agora o projeto Java Certificados irá gerenciar os Cacerts.
- Atualizado Objetos Schema para NT 2020.006 v1.10
- Alterado nome da propriedade contigenciaSCAN para contigenciaSVC
- Melhoria nos Logs
- Atualizado Dependencia Java-Certificado
- Corrigido erros de Assinatura com repositorio Windows
- Atualizado Objetos Schema para NT 2020.006 v1.20
- Adicionado a validação de cancelamento fora do prazo. 
- Adicinado possibilidade de enviar Evento Manual sem assinatura.
- Adicionado URLS NFCe de Santa Catarina
- Correção de Status Serviço MS.
- Atualizado URL consulta NFCe Goias
- Atualizado Schemas/Objetos PL.009f
- Adicionado Compatibilidade com Java 16
- Atualizado biblioteca Certificado versão 2.6

## v4.00.14 - 12/02/2021
- Adicionado 150 - Autorizado Fora do prazo como sucesso na verificação de retorno.
- Atualizado Cacert (Erro NFe Minas)
- Adicionado verificações para evitar configuração nula
- Removido URL Manifestação 1.00
- Adiciona Cpf do Destinatario ao EPEC
- Atualização das URL de consulta NFCe PB (abadvincula)

## v4.00.13 - 09/02/2020
- Corrigido Conflito de dependencia com Spring (servlet-api)
- Atualizado Cacert
- Atualizado WebService do Para para SVRS
- Adicionado Consulta Unica do NSU
- Liberado consulta cadastro para ES e MA
- Adicionado URL NFCe PARA CE
- Adicionado Parametro para configurar numero de Retry (Agradecimentos ao LeonardoWiest (https://github.com/LeonardoWiest))
- Adicionado mais codigos ao StatusEnum 
- Adicionado conversão do Objeto TRetConsCad
- Corrigido Erro de Conversão de procEvento Manifestacao
- Corrigido URL QR-COde homologação AC

## v4.00.12 - 03/08/2019
- Adicionado Calculo de HashCSRT ao XmlNfeUtil -> XmlNfeUtil.geraHashCSRT(chave,csrt)
- Corrigido Erro de Assinatura inválida quando existe quebra de linha no XML.
- Corrigido URL QRCode PI
- Adicionado alguns Testes Unitários
- Corrigido Erro unknown Certificate PR
- Adicionado CPF ao eventos
- Corrigido URL HOmologação NFCe AM
- Adicionado Conversão de Proc Manifestação
- Adicionado Novo código a StatusEnum 
- Adicionado cstat - 136 como retorno Válido na Manifestação
- Corrigido Erro de Assinatura inválida quando existe espaço em branco no final da Tag.

## v4.00.11 - 26/05/2019
- Retirado Exception Genérica
- Retirado Schemas da Compilação para diminuir tamanho da biblioteca
- Corrigido erro de NFe sem namespace PR
- Adicionado regra de Produtor rural para Chave Da Nfe
- Atualizado Cacert
- Adicionado Opção de Informar o ZoneID na montagem dos Eventos
- Adicionado validação de certificado com documento correto.
- Corrigido Consulta Cadastro MT
- Corrigido URL Consulta NFCe: AC, AL, AP, DF, ES, MA, PA, PB, PE, PI, RJ, RN, RO, RS, RR, SE, TO.
- Alterado Validação de CNPJ com certificado, apenas para o CNPj Raiz (8 primeiras posições)
- Correção de algumas Exceptions
- Refatoração de algumas classes
- Inicio testes Unitários.
- Adicionado parametro arquivoWebService em ConfiguracoesNfe para informar Arquivo de WebService manualmente.

## v4.00.10 - 20/03/2019
   **Guia de Migração: https://gist.github.com/Samuel-Oliveira/c547decad469f21ff99de1c766bdc75d**
 - Adicionado Compatibilidade para Java 11
 - Adicionado URL NFCe MG Produção e Homologação
 - Adicionado Conversao para TRetConsReciNFe
 - Adicionado Conversao para TRetEnvEvento para todos os eventos
 - Adicionado Conversao para TRetInut
 - Retirado XsdUtil do Nfe-Xsd e adicionado ao projeto principal
 - Adicionado JavaDoc Em algumas classes(Agradecimento ao Cristofer)
 - Corrigido erro SVC-AN
 - Corrigido URL consulta QrCode MG
 - Agora aceita Acentos na Emissão
 - Verificação de Certificado Vencido
 - Removido as Contanstes e Substituidos por Enums
 - Adicionado Envio de Eventos por Lote
 - Corrigigido erro 411 MG
 - Adicionado Cancelamento por Substituição (NFCe)
 - Atualizado Schemas com as Notas tecnicas 2018.005 v1.00, v1.10 e v1.20
  
## v4.00.9 - 16/12/2018
 - Corrigido URLs PE
 - Adicionado metodo Que remove Acentos Automaticamente.
 - Corrigido URL Consulta Csdastro MG
 - Corrigido URL Qrcode TO
 - Atualizado Cacert
 
## v4.00.8 - 11/10/2018
 - Adicionado Melhorias
 - Corrigo erros acentos
 - Corrigido Urls MT NFe Homologação
 - Corrigido Urls PE NFCe Homologação/Produção
 - Corrigido Erro Pontuação na Validação
 - Adicionado URLs MG Nfce
 - Atualizado Cacert

## v4.00.7 - 03/09/2018 
- Alterado URL MS
- Adicionado URLS AM
- Corrigido erro Consulta Cadastro SVRS
- Agora são aceitos caracteres especiais no XML.
- Criado Metódo para criação do ProcEvento do cancelamento.
- Corrigido ProcInut
- Alterado QrCode para versão 2
** Leia para mais informações https://gist.github.com/Samuel-Oliveira/72f88a91c72465e038dbecd065fe1e12 ** 

## v4.00.6 - 03/07/2018
- Alterado schemas para versão 1.50
- Alterado URLs NFCe MT
- Removido Urls Versão 1.00, 2.00 e 3.10
- Alterado schemas para versão 1.60
- Adicionado Classe para Gerar ID NFE;
- Alterado schemas para versão 1.60b
- **Atenção: Atualizado Schemas faça o download Novamente.** 

## v4.00.5 - 17-06-2018
- Corrigido URLs QrCode Bahia
- Adicionado URLs NFe Produção Amazonas
- Alterado Urls NFce Homologação Ms
- Alterado Urls Consulta NFce GO
- Adicionado Schemas Versão v1_51
- Adicionado Evento Epec
- Atualizado Cacert
- Atualizado Implementação para Ambiente Web
- **Atenção: Atualizado Schemas faça o download Novamente.** 

## v4.00.4 - 10-05-2018
- Adicionado URLS CE Nfe Produção
- Adicionado URLS PE Nfe Produção
- Adicionado URLS RS Nfce Produção
- Adicionado URLS BA Nfce/Nfe Produção e Homologação
- Adicionado URLS SP NFCe Produção
- Adicionado URLS SVRS NFCe Produção
- Adicionado URLS MG NFC Produção
- Adicionado Compatibilidade de Doias A3 conectados na Mesma Maquina!
- Adicionado Possibilidade de pegar o Certificado(Windows) pelo CNPJ 
- Adicionado Consulta Cadastro 4.00 a todos os Estados
- Adicionado WSDL Consulta Cadastro Exclusivo para o RS
- Adicionado parametro para passar o estado da Consulta, no Consulta Cadastro.

## v4.00.3 - 12-03-2018
- Adicionado Conversão de TRetEnviNFe para XML.
- Adicionado Consumo Indevido ao StatusEnum.
- Corrigido Erro de Inicialização de Certificado nos Eventos
- Adicionado opção para validar ou não a Inutilização
- Corrigido Erro de Unknow CA
- Atualizado Cacert
- Adicioando Conversão de TRetConsSitNFe
- Adicionado URLS MT Nfce Homologação
- Corrigido URL de Consulta NFCe SP,PR e PA
- Tratamento para Adicionar justificativa de Manifestção somente no evento de Operação não Realizada.

## v4.00.2 - 13-02-2018
- Adicionado Metodo Para Gerar ProcInutilização (Para Armazenamento)
- Adicionado Diversas URL de WS
- Corrigido Schemas de Cancelamento
- Corrigido Erro De Integração com CTE.
- Adicionado Parametro para TimeOut Especifico

## v4.00.1 - 28-01-2018
- Versão Inicial 4.00 

## v3.10.9 - 26-01-2018
- Atualziado Cacert
- Corrigido URL WS de PE
- Corrigido URL WS de ES
- Ultima Versão 3.10

## v3.10.8 - 04-07-2017
- Corrigido Erro ao Gerar XML de NFC-e sem CDATA no QrCode
- Removido WebService especial da Bahia Para Nfce
- Adicionado Compatibilidade com Certificado A3 fora do Repositorio de Windows
- Adicionado Exception Espeficifica para Erros de Validação
- Adicionado Java_Docs
- Corrigido erros ao Consultar Cadastro de Outro Estado diferente da Configuração
- Adicionado Exception ao não encontrar WebService.
- Removido Metodos e Constantes de Download e Consulta Destinatario 
- Removido a Parte de Certificado Digitais para outro Projeto.
- Melhorado Classe Socket DInamico
- **Atenção: Alterado o caminho do Objeto Certificado, refaça os Imports.** 

## v3.10.7 - 23-05-2017
- Correção Endereço WebService MT.
- Adicionado Cacert com Alterações do AM
- Adicionado Cacert com Alteracao da BA
- Removido Protocol
- Alterado Configurações de Certificado SSL para SocketDinamico 
- Adicionado Serviço De Consulta Cadastro.
- Adicionado Schemas de Consulta Cadastro.
- Alterado Projeto XSD para versão 8.i.2_DFe1.02a

## v3.10.6 - 21-02-2017
- Issues: # 21, #22 e #23.
- Adicionado Metodo para Ler Arquivo XML.
- Adicionado Stubs da Bahia :
   - Status Serviço
   - Consulta Xml
   - Inutilização
- Arquivo Cacert Atualizado
- Correção Endereço WebService MG.
- Adicionado XSD DistribuicaoDFe 1.01
- Adicionado Função PAra Download de Nfe Por Chave.
   
## v3.10.5 - 21-11-2016
- Issues: #15, #16, #17 e #18.
- Alterado Estrutura para as todas as funções que necessitam de Endereço WebService
- Adicionado Constantes
- Adicionado Endereços ConsultaQrcode
- Corrigido Erro De QrCode não vir no XML FInal
- Modo Assincorno Implementado.
- Modo De Contingencia Implementado.
- **Atenção: Alterado a chamada dos metodos: statusServico, consultaXml, consultaXml, inutilizacao, enviarNfe, cancelarNfe, cce
  Todos eles devem adicionar o parametro tipo, ondeve informar se é NFE(ConstantesUtil.NFE) ou NFC-e(ConstantesUtil.NFCE)** 
   
## v3.10.4 - 01-11-2016
- Issues: #10, #11 e #12.
- Corrigido erro especifico do WebServices SVRS, referente ao nameSpace.
- Melhorado Lógica de Replace para os "Lixos" gerados ao Converter Objeto pra Xml
- Adicionado Proxy

## v3.10.3 - 17-10-2016
- Issues: #5, #6, #7 e #8.
- Corrigido erro especifico da Sefaz de PE, referente ao cabeçalho SOAP.
- Corrigido erro de QrCode Vazio.
- Corrigido erro que acontece ao tentar Manifestar a Nfe, sem fazer a validação.
- Adicionado função que remove Acentos no XML antes de assinar a Nota.

## v3.10.2 - 07-10-2016
- Adicionado Compatibilidade com NFC-e 
- Adicionado Método de geração de qrCode : NFCeUtil.getCodeQRCode
- Adicionado Possibilidade de Usar certificado Digital Fisico (Arquivo .pfx)
- Adicionado possibilidade de escolher entre Validar ou não o XMl Antes do Envio de todas as Funções;
- Disponibilizado projeto para download via Maven

## v3.10.1 - 05-10-2016
- Correção de Erros ao listar Certificados Windows Certificados digitais A3 Ausentes.

## v3.10.0 - 26-09-2016
- Versão Inicial Do Sistema

<img src="https://raw.githubusercontent.com/Samuel-Oliveira/Java_NFe/master/jetbrains.png" width="200">
Thanks to JetBrains for supporting this project! https://www.jetbrains.com/?from=Java_NFe
