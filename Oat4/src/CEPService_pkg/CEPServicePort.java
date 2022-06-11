/**
 * CEPServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CEPService_pkg;

public interface CEPServicePort extends java.rmi.Remote {

    /**
     * Retorna a versao do WebService
     */
    public java.lang.String obterVersao() throws java.rmi.RemoteException;

    /**
     * Retorna o nome do logradouro à partir do CEP fornecido. Esse
     * método será desativado em 30 de Outubro de 2008.
     */
    public java.lang.String obterLogradouro(java.lang.String cep) throws java.rmi.RemoteException;

    /**
     * Retorna o nome do logradouro à partir do CEP fornecido. Esse
     * método requer autenticação do usuário.
     */
    public java.lang.String obterLogradouroAuth(java.lang.String cep, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException;

    /**
     * Retorna o CEP à partir do nome do logradouro, localidade e
     * unidade federativa. Atenção: Somente serão retornadas as 5 primeiras
     * linhas. Esse método será desativado em 30 de Outubro de 2008.
     */
    public java.lang.String[] obterCEP(java.lang.String logradouro, java.lang.String localidade, java.lang.String UF) throws java.rmi.RemoteException;

    /**
     * Retorna o CEP à partir do nome do logradouro, localidade e
     * unidade federativa. Esse método requer autenticação de usuário. Se
     * autenticado, retorna as 20 primeiras linhas encontradas.
     */
    public java.lang.String[] obterCEPAuth(java.lang.String logradouro, java.lang.String localidade, java.lang.String UF, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException;
}
