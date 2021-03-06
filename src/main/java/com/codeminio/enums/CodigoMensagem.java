package com.codeminio.enums;

public enum CodigoMensagem {

	LANG_IDIOMA("lang.idioma"),
	LANG_PT_BR("lang.pt_BR"),
	LANG_EN("lang.en"),
	LANG_FR("lang.fr"),
	
	BT_VOLTAR("bt.voltar"),
	BT_SALVAR("bt.salvar"),
	BT_EDITAR("bt.editar"),
	BT_REMOVER("bt.remover"),
	BT_NOVO("bt.novo"),
	
	MSG_INATIVADO_SUCESSO("msg.inativado.sucesso"),
	MSG_SALVAR_SUCESSO("msg.salvar.sucesso"),
	MSG_CPF_INVALIDO("msg.cpf.invalido"),
	MSG_CPF_CADASTRADO("msg.cpf.cadastrado"),
	MSG_EMAIL_INVALIDO("msg.email.invalido"),
	MSG_EMAIL_MALFORMATADO("msg.email.malFormatado"),
	MSG_EMAIL_ENVIADO("msg.email.enviado"),
	MSG_EMAIL_SUCESSO("msg.email.sucesso"),
	MSG_EMAIL_FALHA("msg.email.falha"),
	MSG_OPERACAO_SUCESSO("msg.operacao.sucesso"),
	MSG_EDITAR_SUCESSO("msg.editar.sucesso"),
	MSG_REMOVER_SUCESSO("msg.remover.sucesso"),
	MSG_SENHA_NAOCORRESPONDE("msg.senha.naocorresponde"),
	MSG_SENHA_INCORRETA("msg.senha.incorreta"),
	MSG_DATA_INCORRETA("msg.data.incorreta"),
	MSG_ERRO_CATEGORIA("msg.erro.categoria"),
	MSG_ERRO_TIPOEDITAL("msg.erro.tipoedital"),
	MSG_ERRO_EXCLUSAOINVALIDA("msg.erro.exclusaoInvalida"),
	MSG_ERRO_REMOVER("msg.erro.remover"),
	MSG_CAMPO_OBRIGATORIO("msg.campo.obrigatorio"),
	MSG_IMAGEM_FORMATO_AVISO("msg.imagem.formato.aviso"),
	MSG_IMAGEM_OBRIGATORIO_AVISO("msg.imagem.obrigatorio.aviso"),
	MSG_ARQUIVO_FORMATOINVALIDO("msg.arquivo.formatoInvalido"),
	MSG_REGISTRO_CAMPOS_EMBRANCO("msg.registro.campos.vazios"),
	MSG_CONTATO_CADASTRADO("msg.contato.cadastrado"),
	MSG_CONTATO_SMS_CADASTRADO("msg.contato.sms.cadastrado"),
	MSG_CONTATO_WHATSAPP_CADASTRADO("msg.contato.whatsapp.cadastrado"),
	MSG_CONTATO_URGENCIA_CADASTRADO("msg.contato.urgencia.cadastrado"),
	MSG_CONTATO_OBRIGATORIO("msg.contato.obrigatorio.aviso"),
	MSG_CONTATO_OBSERVACAO_GRANDE("msg.contato.observacao.grande"),
	MSG_CONTATO_VALIDO("msg.contato.valido"),
	MSG_CONTATO_MIN_CARACTERES("msg.contato.min.caracteres"),
	MSG_CONTATO_MAXIMO_CARACTERES("msg.contato.maximo.caracteres"),
	MSG_LOGIN_NAO_PODE_SER_ALTERADO("msg.login.nao.pode.ser.alterado"),
	
	MSG_CONVENIO_TERMOCOMPROMISSO_OBRIGATORIO("msg.convenio.termo.compromisso.obrigatorio"),
	MSG_CONVENIO_TERMOCOMPROMISSO_TIPOVALIDO("msg.convenio.termo.compromisso.tipo.valido"),
	MSG_CONVENIO_TERMOCOMPROMISSO_TAMANHOMAXIMO("msg.convenio.termo.compromisso.tamanho.maximo"),
	MSG_CONVENIO_PRAZOVIGENCIA_INVALIDO("msg.convenio.vigencia.invalida"),
	MSG_CONVENIO_PRAZOVIGENCIA_VAZIO("msg.convenio.vigencia.vazio"),
	MSG_CONVENIO_ENDERECO_OBRIGATORIO("msg.convenio.endereco.obrigatorio"),

	MSG_PACIENTE_RESPONSAVEL_NECESSITACONTATO("msg.paciente.responsavel.necessitaContato"),
	
	MSG_USUARIO_USERNAME_CADASTRADO("msg.usuario.username.cadastrado"),
	MSG_USUARIO_USERNAME_JA_UTILIZADO("msg.usuario.username.ja.utilizado"),
	MSG_PESSOA_EMAIL_CADASTRADO("msg.pessoa.email.cadastrado"),
	
	MSG_PROCEDIMENTO_DATAVIGENCIA_OBRIGATORIO("msg.procedimento.dataVigencia.obrigatorio"),
	MSG_PROCEDIMENTO_DATA_COMPETENCIA_VALIDA("msg.procedimento.data.competencia.valida"),

	MSG_DENOMINACAO_EXISTENTE("msg.denominacao.existente"),
	MSG_ESPECIALIDADE_DENOMINACAO_EXISTENTE("msg.especialidade.denominacao.existente"),
	MSG_ESPECIALIDADE_PROFISSAO_OBRIGATORIA("msg.especialidade.profissao.obrigatoria"),
	MSG_DENOMINACAO_VALIDA("msg.denominacao.denominacaoValida"),
	MSG_CODIGO_EXISTENTE("msg.codigo.existente"),
	MSG_CODIGO_VALIDO("msg.codigo.valido"),
	MSG_CODIGO_INCOMPLETO("msg.codigo.incompleto"),
	MSG_CAPACIDADE_ZERO("msg.capacidade.zero"),
	
	MSG_COLABORADOR_OBRIGATORIO("msg.colaborador.obrigatorio"),
	
	MSG_PACIENTE_NECESSITARESPONSAVEL("msg.paciente.necessitaResponsavel"),
	MSG_PACIENTE_SUGESTAOPONSAVEL("msg.paciente.sugestaoResponsavel"),
	MSG_PACIENTE_EMANCIPADOMAIOR("msg.paciente.emancipadoMaior"),
	MSG_PACIENTE_EMANCIPADOMENORLIMITE("msg.paciente.emancipadoMenorLimite"),
	MSG_PACIENTE_NOMESOCIALNECESSARIO("msg.paciente.nomeSocialNecessario"),
	MSG_PACIENTE_GENERONECESSARIO("msg.paciente.generoNecessario"),
	MSG_PACIENTE_PASSAPORTENECESSARIO("msg.paciente.passaporteNecessario"),
	MSG_PACIENTE_NASCIMENTOVALIDO("msg.paciente.dataNascimentoValida"),
	MSG_PACIENTE_NOMEVALIDO("msg.paciente.nomeValido"),
	MSG_PACIENTE_HISTORICO_INCOMPLETO("msg.paciente.historico.incompleto"),
	MSG_PACIENTE_HOMONIMO("msg.paciente.homonimo"),
	MSG_PACIENTE_NOMEMAE("msg.paciente.nome.mae"),
	MSG_PACIENTE_NOMEPAI("msg.paciente.nome.pai"),
	MSG_PACIENTE_SEXO("msg.paciente.sexo"),
	MSG_PACIENTE_DEFICIENCIAVALIDA("msg.paciente.deficiencia.valida"),
	MSG_PACIENTE_RG_OBRIGATORIO("msg.paciente.rg.obrigatorio"),
	MSG_PACIENTE_RG_ORGAO_EMISSOR("msg.paciente.rg.orgao.emissor"),
	MSG_PACIENTE_RGVALIDO("msg.paciente.rg.valido"),
	MSG_PACIENTE_ORGEMISSOROBRIGATORIO("msg.paciente.rg.orgao.emissor.obrigatorio"),
	MSG_PACIENTE_DATA_NASCIMENTO_OBRIGATORIA("msg.paciente.data.obrigatoria"),
	MSG_PACIENTE_DATA_NASCIMENTO_INVALIDA("msg.paciente.data.invalida"),
	
	MSG_PACIENTE_ORGEXPEDIDORVALIDO("msg.paciente.orgexpedidor.valido"),
	MSG_PACIENTE_EMAIL_OBRIGATORIO("msg.paciente.email.obrigatorio"),
	
	MSG_PACIENTE_RESPONSAVEL_NOMEVALIDO("msg.paciente.responsavel.nomeValido"),
	
	MSG_PACIENTE_ENDERECO_LOGRADOUROVALIDO("msg.paciente.endereco.logradouro.valido"),
	MSG_PACIENTE_ENDERECO_BAIRROVALIDO("msg.paciente.endereco.bairro.valido"),
	MSG_PACIENTE_ENDERECO_NUMEROVALIDO("msg.paciente.endereco.numero.valido"),
	MSG_PACIENTE_ENDERECO_NUMERO_MAX_CARACTERES("msg.paciente.endereco.numero.max.caracteres"),
	MSG_PACIENTE_ENDERECO_LOGRADOURO_MAX_CARACTERES("msg.paciente.endereco.logradouro.max.caracteres"),
	MSG_PACIENTE_ENDERECO_BAIRRO_MAX_CARACTERES("msg.paciente.endereco.bairro.max.caracteres"),
	
	MSG_API_PESSOA_NAOENCONTRADO("msg.api.pessoa.naoEncontrado"),
	MSG_API_PESSOA_NAOENCONTRADO_SIGAA("msg.api.pessoa.naoEncontrado.sigaa"),
	MSG_API_ENDERECO_NAOENCONTRADO("msg.api.endereco.naoEncontrado"),
	MSG_API_VINCULO_NAOENCONTRADO("msg.api.vinculo.naoEncontrado"),
	MSG_API_VINCULO_EXCEDENTES("msg.api.vinculo.excedentes"), 
	
	MSG_FORM_CONSULTA_CAMPOSVAZIOS("msg.form.consulta.camposvazios"),
	MSG_OFERTA_SERVICO_DATA_TERMINO("msg.ofertaServico.data.termino"),
	MSG_OFERTA_SERVICO_DATAS("msg.ofertaServico.datas"),
	MSG_OFERTA_SERVICO_INATIVAR("msg.ofertaServico.inativa"),
	MSG_OFERTA_SERVICO_SERVICO("msg.ofertaServico.servico"),
	MSG_OFERTA_SERVICO_PROCEDIMENTOS_VAZIO("msg.ofertaServico.procedimentos.vazio"),
	MSG_OFERTA_SERVICO_ESPECIALIDADE_SEM_PROFISSIONAL("msg.ofertaServico.especialidade.sem.profissional"),
	MSG_MODALIDADE_OBRIGATORIA("msg.servico.modalidade.obrigatoria"),
	MSG_ENDERECO_OBRIGATORIO("msg.endereco.obrigatorio"),

	MSG_COLABORADOR_SEM_USUARIO("msg.servico.colaborador.sem.usuario"),
	

	MSG_COLABORADOR_EXCLUSAO_INVALIDA("msg.colaborador.exclusao.invalida"),
	
	MSG_PROFISSAO_EXCLUSAO_INVALIDA("msg.profissao.exclusao.invalida"),
	MSG_PROFISSAO_NOME_EXISTENTE("msg.profissao.nome.repetido"),
	MSG_PROFISSAO_SIGLA_EXISTENTE("msg.profissao.sigla.repetida"),
	
	MSG_PERFIL_ACESSO_NOME_EXISTENTE("msg.perfil.acesso.nome.repetido"),
	
	MSG_OFERTA_SERVICO_ESPECIALIDADE("msg.ofertaServico.especialidade"),

	MSG_ESPECIALIDADE_SIGLA("msg.especialidade.sigla"),		
	MSG_UF_INVALIDO("msg.uf.invalido"),
	MSG_MUNICIPIO_INVALIDO("msg.municipio.invalido"),
	MSG_BAIRRO_INVALIDO("msg.endereco.bairro.invalido"),
	MSG_LOGRADOURO_INVALIDO("msg.endereco.logradouro.invalido"),
	
	MSG_COLABORADOR_MAX_CARACTERES("msg.colaborador.max.caracteres"),
	
	MSG_PROFISSIONAL_SAUDE_LOGIN_MAX_CARACTERES("msg.profissionalSaude.login.max.caracteres"),
	MSG_PROFISSIONAL_SAUDE_NOME_OBRIGATORIO("msg.profissionalSaude.nome.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_CPF_OBRIGATORIO("msg.profissionalSaude.cpf.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_ESPECIALIDADE_OBRIGATORIO("msg.profissionalSaude.especialidade.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_UNIDADE_OBRIGATORIO("msg.profissionalSaude.unidade.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_EMAIL_OBRIGATORIO("msg.profissionalSaude.email.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_LOGIN_OBRIGATORIO("msg.profissionalSaude.login.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_IDENTIDADE_PROFISSIONAL_OBRIGATORIO("msg.profissionalSaude.identidadeProfissional.obrigatorio"),
	MSG_PROFISSIONAL_SAUDE_LOGIN_CADASTRADO("msg.profissionalSaude.login.cadastrado"),
	MSG_PROFISSIONAL_SAUDE_IDENTIDADE_PROFISSIONAL_CADASTRADO("msg.profissionalSaude.identidadeProfissional.cadastrado"),
	MSG_ESCALA_CONFLITANTE("msg.escala.conflitante"),
	MSG_ESCALA_FORA_DA_OFERTA_DE_SERVICO("msg.escala.foraDaOfertaServico"),
	MSG_ESCALA_JUSTIFICATIVA_OBRIGATORIA("msg.escala.justificatica.obrigatoria"),
	MSG_ESPECIALIDADE_SEM_PROFISSIONAL("msg.especialidade.sem.profissional.cadastrado"),
	MSG_JUSTIFICATIVAINATIVACAO_VAZIA("msg.justificativaInativacao.vazia"),
	MSG_USUARIO_SENHA_ALTERAR_OBRIGATORIA("msg.usuario.senha.alterar.obrigatoria"),
	MSG_USUARIO_SENHA_NAO_IGUAIS("msg.usuario.senha.nao.iguais"),
	
	MSG_OFERTA_ESPECIALIDADE_SERVICO_OBRIGATORIO("msg.ofertaEspecialidade.servico.obrigatorio"),
	MSG_OFERTA_ESPECIALIDADE_ESPECIALIDADE_OBRIGATORIA("msg.ofertaEspecialidade.especialidade.obrigatoria"),
	MSG_OFERTA_ESPECIALIDADE_PROCEDIMENTO_OBRIGATORIO("msg.ofertaEspecialidade.procedimento.obrigatorio"),
	MSG_OFERTA_ESPECIALIDADE_ESCALA_OBRIGATORIA("msg.ofertaEspecialidade.escala.obrigatorio"),
	MSG_OFERTA_ESPECIALIDADE_DATA_INICIO("msg.ofertaEspecialidade.data.inicio"),
	MSG_OFERTA_ESPECIALIDADE_DATA_TERMINO("msg.ofertaEspecialidade.data.termino"),
	MSG_OFERTA_ESPECIALIDADE_EXISTENTE("msg.ofertaEspecialidade.existente"),
	MSG_OFERTA_ESPECIALIDADE_ANO("msg.ofertaEspecialidade.ano"),
    MSG_OFERTA_ESPECIALIDADE_POSSUI_AGENDAMENTOS("msg.ofertaEspecialidade.possui.agendamentos"),
    MSG_OFERTA_ESPECIALIDADE_ESPECIALIDADE_REPETIDA("msg.ofertaEspecialidade.especialidade.repetida"),
	MSG_OFERTA_ESPECIALIDADE_LIMITE_DE_CARACTERES_DENOMINACAO("msg.ofertaEspecialidade.limite.caracteres"),
	MSG_OFERTA_ESPECIALIDADE_DENOMINACAO_INVALIDA("msg.ofertaEspecialidade.denominacao.invalida"),
	MSG_OFERTA_DENOMINACAO_EXISTENTE("msg.ofertaEspecialidade.denominacao.existente"),
	MSG_SERVICO_ENDERECO_OBRIGATORIO("msg.servico.endereco.obrigatorio"),
	MSG_SERVICO_UNIDADE_OBRIGATORIA("msg.servico.unidade.obrigatoria"),
	
	MSG_ESPECIALIDADE_SUBESPECIALIDADE("msg.especialudade.subespecialidade"),
	MSG_ESPECIALIDADE_ESPECIALIDADE_PRINCIPAL("msg.especialidade.especialidade.principal"),
	MSG_PROJETO_TIPO_INVALIDO("msg.projeto.tipo.invalido"),
	MSG_PROJETO_CODIGO_OBRIGATORIO("msg.projeto.codigo.obrigatorio"),
	MSG_PROJETO_DADOS_INVALIDOS("msg.projeto.dados.invalidos"),
	MSG_PROJETO_NOME_INVALIDO("msg.projeto.nome.invalido"),
	MSG_HORARIO_ESCALA_HORARIOS_DUPLICADOS_ESCALA("msg.horario.escala.horarios.duplicados.escala"),
	MSG_HORARIO_ESCALA_DATA_INICIO("msg.horario.escala.data.inicio"),
	MSG_HORARIO_ESCALA_DATA_FIM("msg.horario.escala.data.fim"),
	MSG_HORARIO_ESCALA_ESCALA_OBRIGATORIA("msg.horario.escala.escala.obrigatoria"),
	MSG_HORARIO_ESCALA_TEMPO_MEDIO("msg.horario.escala.tempo.medio"),
	MSG_HORARIO_ESCALA_POSSUI_HORARIOS_ESCALA_PROFISSIONAL("msg.horario.escala.possui.horario.escala.profissional"),
	MSG_HORARIO_ESCALA_EXISTEM_CONFLITOS_DE_HORARIO("msg.horario.escala.existem.conflitos.de.horario"),

	MSG_HORARIO_PROFISSIONAL_POSSUI_AGENDAMENTOS_AGENDADOS("msg.horario.profissional.possui.agendamento.agendado"),
	
	MSG_USUARIO_SENHA_TAMANHO("msg.usuario.senha.tamanho"),
	MSG_ACESSO_API_UFRN_NEGADO("msg.acessoApiUfrn.negado"), 
	
	MSG_ESCALA_OFERTA_REPETIDA("msg.escala.oferta.repetida"),
	MSG_ESCALA_OFERTA_UM_MAIS_HORARIOS("msg.escala.oferta.um.mais.horarios"),
	MSG_ESCALA_OFERTA_DATA_INICIO("msg.escala.oferta.data.inicio"),
	MSG_ESCALA_OFERTA_DATA_TERMINO("msg.escala.oferta.data.termino"),
	MSG_ESCALA_OFERTA_OFERTA_ESPECIALIDADE_OBRIGATORIA("msg.escala.oferta.especialidade.obrigatoria"),
	MSG_ESCALA_OFERTA_ESCALA_SOBREPOSTA_MESMA_ESPECIALIDADE("msg.escala.oferta.escala.sobreposta.mesma.especialidade"),
	MSG_ESCALA_OFERTA_INATIVAR_COM_HORARIO_AGENDADO("msg.escala.oferta.inativar.horario.agendado"),
	MSG_ESCALA_OFERTA_DESCRICAO_REPETIDA("msg.escala.oferta.descricao.repetida"),
	
	MSG_AGENDAMENTO_ESPECIALIDADE_NAO_OFERTADA("msg.agendamento.especialidade.nao.ofertada"),
	MSG_AGENDAMENTO_JA_CADASTRADO("msg.agendamento.ja.cadastrado"),
	MSG_AGENDAMENTO_JA_CADASTRADO_PARA_USUARIO_MESMO_HORARIO("msg.agendamento.ja.cadastrado.usuario.inicio.fim"),
	MSG_AGENDAMENTO_REGISTRA_COLABORADOR("msg.agendamento.registra.colaborador"),
	MSG_AGENDAMENTO_CONSULTA_RESULTADO_VAZIO("msg.agendamento.consulta.resultado.vazio"),
	MSG_AGENDAMENTO_SEM_ESPECIALIDADE("msg.agendamento.sem.especialidade"),
	MSG_AGENDAMENTO_SEM_OFERTA_ESPECIALIDADE("msg.agendamento.sem.oferta.especialidade"),
	MSG_AGENDAMENTO_VALOR_PADRAO_STATUS_AGENDAMENTO("msg.agendamento.valor.padrao.status.agendamento"),
	MSG_AGENDAMENTO_STATUS_CANCELADO("msg.agendamento.status.cancelado"),
	MSG_AGENDAMENTO_HORARIO_INDISPONIVEL("msg.agendamento.horario.indisponivel"),
	MSG_AGENDAMENTO_VINCULO_HORARIO_PROFISSIONAL("msg.agendamento.vinculo.horario.profissional"),
	MSG_AGENDAMENTO_MUDAR_STATUS_DATA_ANTERIOR("msg.agendamento.status.data.anterior"),
	MSG_AGENDAMENTO_DATA_AGENDAMENTO_ANTES_DE_DATA_ATUAL("msg.agendamento.data.agendamento.antes.data.atual"),
	MSG_AGENDAMENTO_JA_CADASTRADADO("msg.agendamento.jacadastrado"),
	
	MSG_HORARIO_PROFISSIONAL_HORARIO_UNICO("msg.horario.profissional_horario_unico"),
	MSG_HORARIO_PROFISSIONAL_UNICO("msg.horario.profissional_unico"),
	MSG_HORARIO_PROFISSIONAL_INICIO_FIM_DIFERENTES("msg.horario.profissional.inicio.fim.diferentes"),
	
	MSG_TURMA_CAPACIDADE_VALIDA_ADICIONAR_ALUNO("msg.turma.capacidade.valida.adicionar.aluno"),
	MSG_TURMA_PROFISSIONAL_SAUDE_OBRIGATORIO("msg.turma.profissional.saude.obrigatorio"),
	MSG_TURMA_CAPACIDADE_MAIOR_ZERO("msg.turma.turma.capacidade.maior.zero"),
	MSG_TURMA_SERVICO_OBRIGATORIO("msg.turma.servico.obrigatorio"),
	MSG_TURMA_RESPONSAVEL_OBRIGATORIO("msg.turma.responsavel.obrigatorio"),
	MSG_TURMA_ESPECIALIDADE_OBRIGATORIA("msg.turma.especialidade.obrigatoria"),
	MSG_TURMA_FINALIZADA("msg.turma.finalizada"),
	MSG_TURMA_EXISTENTE("msg.turma.existente"),
	MSG_TURMA_NOME_OBRIGATORIO("msg.turma.nome.obrigatorio"),
	MSG_TURMA_TIPO_OBRIGATORIO("msg.turma.tipo.obrigatorio"),
	MSG_TURMA_SITUACAO_OBRIGATORIA("msg.turma.situacao.obrigatoria"),
	MSG_TURMA_CAPACIDADE_OBRIGATORIA("msg.turma.capacidade.obrigatoria"),
	MSG_TURMA_CODIGO_OBRIGATORIO("msg.turma.codigo.obrigatorio"),
	MSG_TURMA_ALUNO_OBRIGATORIO("msg.turma.aluno.obrigatorio"),
	MSG_TURMA_ALUNO_REPETIDO("msg.turma.aluno.repetido"),
	MSG_USUARIO_NAO_ENCONTRADO("msg.aluno.nao.encontrado"),
	MSG_TURMA_PROFISSIONAL_REPETIDO("msg.turma.profissional.saude.repetido"),
	MSG_TURMA_RESPONSAVEL_NAO_RETIRAVEL("msg.turma.responsavel.principal.nao.retiravel"),
	
	MSG_ALUNO_USUARIO_OBRIGATORIO("msg.aluno.usuario.obrigatorio"),
	MSG_ALUNO_EMAIL_REPETIDO("msg.aluno.email.repetido"),
	MSG_ALUNO_LOGIN_REPETIDO("msg.aluno.login.repetido"),
	
	MSG_VINCULO_PROFISSIONAL_OBRIGATORIO("msg.vinculo.profissional.responsavel.obrigatorio"),
	MSG_VINCULO_MATRICULA_OBRIGATORIA("msg.vinculo.matricula.obrigatoria"),
	MSG_VINCULO_SITUACAO_OBRIGATORIA("msg.vinculo.situacao.obrigatoria"),
	MSG_VINCULO_NIVEL_OBRIGATORIO("msg.vinculo.nivel.obrigatorio"),
	MSG_VINCULO_CURSO_OBRIGATORIO("msg.vinculo.curso.obrigatorio"),
	MSG_VINCULO_REPETIDO("msg.vinculo.nivel.repetido"),
	MSG_VINCULO_OBRIGATORIO("msg.vinculo.obrigatorio"),
	MSG_MATRICULA_REPETIDA("msg.vinculo.matricula.repetida"),
	MSG_VALIDATOR_NOME("msg.validator.nome.valido"),
	MSG_VALIDATOR_EMAIL("msg.validator.email.valido"),
	
	
	MSG_PROCEDIMENTO_ESPECIALIDADE_OBRIGATORIA("msg.procedimento.especialidade.obrigatoria"),
	
	MSG_DENOMINACAO_OBRIGATORIA("msg.denominacao.obrigatoria"),
	
	MSG_TIPOAGENDAMENTO_DENOMINACAO_CADASTRADA("msg.tipoAgendamento.denominacao.cadastrada");
		
	private final String codigo;
	
	CodigoMensagem(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
}
