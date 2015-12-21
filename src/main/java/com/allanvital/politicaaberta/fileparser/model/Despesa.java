package com.allanvital.politicaaberta.fileparser.model;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.commons.lang3.text.WordUtils;

import com.allanvital.politicaaberta.fileparser.dto.Deputy;
import com.allanvital.politicaaberta.fileparser.dto.ParliamentarianExpense;

public class Despesa {

	private String txNomeParlamentar;
	
	private int ideCadastro;
	
	private int nuCarteiraParlamentar;
	
	private int nuLegislatura;
	
	private String sgUF;
	
	private String sgPartido;
	
	private String codLegislatura;
	
	private int numSubCota;
	
	private String txtDescricao;
	
	private int numEspecificacaoSubCota;
	
	private String txtDescricaoEspecificacao;
	
	private String txtFornecedor;
	
	private String txtCNPJCPF;
	
	private String txtNumero;
	
	private int indTipoDocumento;
	
	private String datEmissao;
	
	private BigDecimal vlrDocumento;
	
	private BigDecimal vlrGlosa;
	
	private BigDecimal vlrLiquido;
	
	private int numMes;
	
	private int numAno;
	
	private int numParcela;
	
	private String txtPassageiro;
	
	private String txtTrecho;
	
	private int numLote;
	
	private int numRessarcimento;
	
	public String getTxNomeParlamentar() {
		return txNomeParlamentar;
	}
	public void setTxNomeParlamentar(String txNomeParlamentar) {
		this.txNomeParlamentar = txNomeParlamentar;
	}
	public int getIdeCadastro() {
		return ideCadastro;
	}
	public void setIdeCadastro(int ideCadastro) {
		this.ideCadastro = ideCadastro;
	}
	public int getNuCarteiraParlamentar() {
		return nuCarteiraParlamentar;
	}
	public void setNuCarteiraParlamentar(int nuCarteiraParlamentar) {
		this.nuCarteiraParlamentar = nuCarteiraParlamentar;
	}
	public int getNuLegislatura() {
		return nuLegislatura;
	}
	public void setNuLegislatura(int nuLegislatura) {
		this.nuLegislatura = nuLegislatura;
	}
	public String getSgUF() {
		return sgUF;
	}
	public void setSgUF(String sgUF) {
		this.sgUF = sgUF;
	}
	public String getSgPartido() {
		return sgPartido;
	}
	public void setSgPartido(String sgPartido) {
		this.sgPartido = sgPartido;
	}
	public String getCodLegislatura() {
		return codLegislatura;
	}
	public void setCodLegislatura(String codLegislatura) {
		this.codLegislatura = codLegislatura;
	}
	public int getNumSubCota() {
		return numSubCota;
	}
	public void setNumSubCota(int numSubCota) {
		this.numSubCota = numSubCota;
	}
	public String getTxtDescricao() {
		return txtDescricao;
	}
	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}
	public int getNumEspecificacaoSubCota() {
		return numEspecificacaoSubCota;
	}
	public void setNumEspecificacaoSubCota(int numEspecificacaoSubCota) {
		this.numEspecificacaoSubCota = numEspecificacaoSubCota;
	}
	public String getTxtDescricaoEspecificacao() {
		return txtDescricaoEspecificacao;
	}
	public void setTxtDescricaoEspecificacao(String txtDescricaoEspecificacao) {
		this.txtDescricaoEspecificacao = txtDescricaoEspecificacao;
	}
	public String getTxtFornecedor() {
		return txtFornecedor;
	}
	public void setTxtFornecedor(String txtFornecedor) {
		this.txtFornecedor = txtFornecedor;
	}
	public String getTxtCNPJCPF() {
		return txtCNPJCPF;
	}
	public void setTxtCNPJCPF(String txtCNPJCPF) {
		this.txtCNPJCPF = txtCNPJCPF;
	}
	public String getTxtNumero() {
		return txtNumero;
	}
	public void setTxtNumero(String txtNumero) {
		this.txtNumero = txtNumero;
	}
	public int getIndTipoDocumento() {
		return indTipoDocumento;
	}
	public void setIndTipoDocumento(int indTipoDocumento) {
		this.indTipoDocumento = indTipoDocumento;
	}
	public String getDatEmissao() {
		return datEmissao;
	}
	public void setDatEmissao(String datEmissao) {
		this.datEmissao = datEmissao;
	}
	public BigDecimal getVlrDocumento() {
		return vlrDocumento;
	}
	public void setVlrDocumento(BigDecimal vlrDocumento) {
		this.vlrDocumento = vlrDocumento;
	}
	public BigDecimal getVlrGlosa() {
		return vlrGlosa;
	}
	public void setVlrGlosa(BigDecimal vlrGlosa) {
		this.vlrGlosa = vlrGlosa;
	}
	public BigDecimal getVlrLiquido() {
		return vlrLiquido;
	}
	public void setVlrLiquido(BigDecimal vlrLiquido) {
		this.vlrLiquido = vlrLiquido;
	}
	public int getNumMes() {
		return numMes;
	}
	public void setNumMes(int numMes) {
		this.numMes = numMes;
	}
	public int getNumAno() {
		return numAno;
	}
	public void setNumAno(int numAno) {
		this.numAno = numAno;
	}
	public int getNumParcela() {
		return numParcela;
	}
	public void setNumParcela(int numParcela) {
		this.numParcela = numParcela;
	}
	public String getTxtPassageiro() {
		return txtPassageiro;
	}
	public void setTxtPassageiro(String txtPassageiro) {
		this.txtPassageiro = txtPassageiro;
	}
	public String getTxtTrecho() {
		return txtTrecho;
	}
	public void setTxtTrecho(String txtTrecho) {
		this.txtTrecho = txtTrecho;
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	public int getNumRessarcimento() {
		return numRessarcimento;
	}
	public void setNumRessarcimento(int numRessarcimento) {
		this.numRessarcimento = numRessarcimento;
	}
		
	public ParliamentarianExpense buildExpense() {
		ParliamentarianExpense expense = new ParliamentarianExpense();
		expense.setDeputySiteId(this.ideCadastro);
		expense.setDescription(WordUtils.capitalizeFully(this.txtDescricao));
		expense.setValue(this.vlrDocumento);
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.MONTH, this.numMes);
		calendar.set(Calendar.YEAR, this.numAno);
		expense.setExpenseMonthAndYear(calendar);
		
		return expense;
	}
	
	public Deputy buildDeputy() {
		Deputy deputy = new Deputy();
		deputy.setSiteId(this.ideCadastro);
		deputy.setParty(this.sgPartido);
		deputy.setName(WordUtils.capitalizeFully(this.txNomeParlamentar));
		deputy.setUf(this.sgUF);
		//deputy.setSecondarySiteId(this.nuCarteiraParlamentar);
		
		return deputy;
	}
	
}
