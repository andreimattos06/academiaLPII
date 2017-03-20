CREATE TABLE `aluno` (
  `nome` varchar(20) NOT NULL,
  `sobrenome` varchar(20) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `data_nascimento` date NOT NULL,
  `peso` float NOT NULL,
  `altura` float NOT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `instrutor` (
  `nome` varchar(20) NOT NULL,
  `sobrenome` varchar(20) NOT NULL,
  `cref` varchar(6) NOT NULL,
  `data_nascimento` varchar(20) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`cref`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ficha_treino` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf_aluno` varchar(11) NOT NULL,
  `cref_instrutor` varchar(6) NOT NULL,
  `horario` varchar(8) NOT NULL,
  `segunda` set('treino A','treino B','treino C') DEFAULT NULL,
  `terca` set('treino A','treino B','treino C') DEFAULT NULL,
  `quarta` set('treino A','treino B','treino C') DEFAULT NULL,
  `quinta` set('treino A','treino B','treino C') DEFAULT NULL,
  `sexta` set('treino A','treino B','treino C') DEFAULT NULL,
  `sabado` set('treino A','treino B','treino C') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cpf_aluno` (`cpf_aluno`),
  KEY `cref_instrutor` (`cref_instrutor`),
  CONSTRAINT `ficha_treino_ibfk_1` FOREIGN KEY (`cpf_aluno`) REFERENCES `aluno` (`cpf`),
  CONSTRAINT `ficha_treino_ibfk_2` FOREIGN KEY (`cref_instrutor`) REFERENCES `instrutor` (`cref`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

CREATE TABLE `enderecoi` (
  `cref` varchar(6) NOT NULL,
  `logradouro` varchar(30) NOT NULL,
  `bairro` varchar(20) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `cep` varchar(20) NOT NULL,
  PRIMARY KEY (`cref`),
  KEY `cref` (`cref`),
  CONSTRAINT `EnderecoI_ibfk_1` FOREIGN KEY (`cref`) REFERENCES `instrutor` (`cref`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `enderecoa` (
  `cpf` varchar(11) NOT NULL,
  `logradouro` varchar(30) NOT NULL,
  `bairro` varchar(20) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `cep` varchar(20) NOT NULL,
  PRIMARY KEY (`cpf`),
  KEY `cpf` (`cpf`),
  CONSTRAINT `EnderecoA_ibfk_1` FOREIGN KEY (`cpf`) REFERENCES `aluno` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
