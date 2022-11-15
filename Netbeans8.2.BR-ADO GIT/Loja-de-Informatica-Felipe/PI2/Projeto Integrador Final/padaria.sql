-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 29-Nov-2021 às 20:12
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `padaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cargo`
--

CREATE TABLE `tb_cargo` (
  `id_cargo` int(11) NOT NULL,
  `cargo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_cargo`
--

INSERT INTO `tb_cargo` (`id_cargo`, `cargo`) VALUES
(1, 'vendedor'),
(2, 'gerente'),
(3, 'Administrador');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_categoria`
--

CREATE TABLE `tb_categoria` (
  `id_categoria` int(11) NOT NULL,
  `categoria` varchar(50) NOT NULL,
  `usr_id` varchar(4) DEFAULT NULL,
  `data_exclusao` timestamp NULL DEFAULT NULL,
  `excluido` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_categoria`
--

INSERT INTO `tb_categoria` (`id_categoria`, `categoria`, `usr_id`, `data_exclusao`, `excluido`) VALUES
(1, 'Bolo', NULL, NULL, 0),
(2, 'Paes', NULL, NULL, 0),
(3, 'Bebidas', '6', '2021-11-16 03:00:00', 1),
(4, 'Queijo', NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cliente`
--

CREATE TABLE `tb_cliente` (
  `id_cliente` int(11) NOT NULL,
  `id_usr` int(11) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  `Nome` varchar(80) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `excluido` tinyint(1) NOT NULL DEFAULT 0,
  `data_exclusao` date DEFAULT NULL,
  `data_nascimento` varchar(10) NOT NULL,
  `email` varchar(70) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `Estado_civil` varchar(10) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `usr_exclusao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_cliente`
--

INSERT INTO `tb_cliente` (`id_cliente`, `id_usr`, `CPF`, `Nome`, `telefone`, `excluido`, `data_exclusao`, `data_nascimento`, `email`, `sexo`, `Estado_civil`, `Endereco`, `usr_exclusao`) VALUES
(1, 1, '52348479850', 'Leonardo lemes Mendes', '11968440258', 0, NULL, '16/08/1998', 'leonardo@email.com', 'Masculino', 'Casado', 'Rua de teste 298', ''),
(4, 1, '77777777777', 'teste teste', '898798578', 1, '2021-11-08', '16/08/1998', 'teste@email.com', 'Masculino', 'Solteiro', 'Rua de teste 298', '1'),
(5, 6, '52348479851', 'teste teste', '1169789565', 1, '2021-11-16', '12/06/2003', 'teste@email.com', 'Masculino', 'Solteiro', 'Rua teste 123', '6'),
(6, 6, '77777777777', 'Sarah Mello ', '119687874598', 0, NULL, '2/04/2001', 'sarah@email.co.br', 'Feminino', 'Solteiro', 'Rua da Sarah Mello , 237', NULL),
(7, 6, '40419878503', 'Gusta', '11968978548', 0, NULL, '12/05/2001', 'gusta@email.com', 'Feminino', 'Viúvo', 'Rua de teste 236', NULL),
(8, 6, '50964378841', 'sarah mello carvalho', '11968798598', 0, NULL, '28/04/2001', 'sarah@email.com', 'Feminino', 'Casado', 'Rua da Sarah 235', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_item_venda`
--

CREATE TABLE `tb_item_venda` (
  `id_item` int(11) NOT NULL,
  `id_venda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtde` int(11) NOT NULL,
  `valor` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_item_venda`
--

INSERT INTO `tb_item_venda` (`id_item`, `id_venda`, `id_produto`, `qtde`, `valor`) VALUES
(1, 1, 2, 1, '12.00'),
(2, 2, 3, 2, '13.60'),
(3, 1, 1, 1, '12.50'),
(4, 1, 2, 1, '18.95'),
(5, 4, 1, 1, '12.50'),
(6, 4, 2, 2, '18.95'),
(7, 5, 3, 2, '6.80'),
(8, 5, 4, 1, '2.00'),
(9, 6, 7, 1, '12.25'),
(10, 6, 4, 2, '2.00'),
(11, 7, 1, 3, '12.50'),
(12, 7, 7, 1, '12.25');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produto`
--

CREATE TABLE `tb_produto` (
  `id_produto` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `qtde` int(11) NOT NULL,
  `descricao` varchar(70) NOT NULL,
  `valor` decimal(7,2) NOT NULL,
  `excluido` tinyint(1) NOT NULL DEFAULT 0,
  `usr_id` varchar(4) NOT NULL,
  `data_exclusao` timestamp NULL DEFAULT NULL,
  `usr_exclusao` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_produto`
--

INSERT INTO `tb_produto` (`id_produto`, `id_categoria`, `nome`, `qtde`, `descricao`, `valor`, `excluido`, `usr_id`, `data_exclusao`, `usr_exclusao`) VALUES
(1, 1, 'Bolo de limão', 1, 'Bolo de limão 500g ', '12.50', 0, '', '0000-00-00 00:00:00', NULL),
(2, 1, 'Bolo de Laranja ', 8, 'Bolo de Laranja  450g', '18.95', 0, '2', NULL, NULL),
(3, 2, 'Pão de queijo', 8, 'Pão de queijo minas 500g', '6.85', 0, '2', NULL, NULL),
(4, 2, 'Pão francês', 2, 'Pão frances 10 unidades', '2.00', 0, '2', NULL, NULL),
(5, 1, 'bolo de cenoura', 8, 'bolo de cenoura 1kg', '13.95', 1, '6', '2021-11-16 03:00:00', '6'),
(6, 2, 'Pão de forma', 7, 'pão de forma panco 500g', '2.96', 0, '6', NULL, NULL),
(7, 1, 'Bolo de cenoura com chocolate', 6, 'Bolo de cenoura com cobertura de chocolate 500g', '12.25', 0, '6', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `id_usr` int(11) NOT NULL,
  `id_cargo` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `data_nascimento` varchar(10) NOT NULL,
  `excluido` tinyint(1) NOT NULL DEFAULT 0,
  `data_exclusao` timestamp NULL DEFAULT NULL,
  `usr_id` varchar(4) DEFAULT NULL,
  `senha` varchar(70) NOT NULL,
  `email` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_usuario`
--

INSERT INTO `tb_usuario` (`id_usr`, `id_cargo`, `nome`, `cpf`, `data_nascimento`, `excluido`, `data_exclusao`, `usr_id`, `senha`, `email`) VALUES
(1, 1, 'Leonardo Moreno Lemes', '52348479850', '08/06/2001', 0, '2021-11-02 21:32:00', '', '', 'felipe@email.com'),
(2, 1, 'sarah mello', '55555555555', '28/04/2001', 1, '2021-11-03 03:00:00', '2', 'b68be79050927b9fc54b49d848bf3aab', 'sarah.m@email.com'),
(3, 1, 'Felipe Santana', '77777777777', '20/09/2001', 1, '2021-11-16 03:00:00', '6', '73642374d23cf632b4e62f25af54e367', 'felipe@email.com'),
(4, 1, 'Sarah mello Carvalho', '55555555555', '28/04/2001', 1, '2021-11-22 03:00:00', '6', 'b68be79050927b9fc54b49d848bf3aab', 'sarahmello@email.com'),
(5, 1, 'Luciana', '99999999988', '06/09/2004', 1, '2021-11-15 03:00:00', '2', '25f9e794323b453885f5181f1b624d0b', 'lu@email.com'),
(6, 3, 'admin', '55555555555', '12/08/2001', 0, NULL, NULL, '21232f297a57a5a743894a0e4a801fc3', 'admin'),
(7, 2, 'Teste', '88888888888', '28/04/2001', 0, NULL, NULL, 'b918f5d7e8350a33ed7f912591c1225e', 'teste@email.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_venda`
--

CREATE TABLE `tb_venda` (
  `id_venda` int(11) NOT NULL,
  `id_usr` int(11) NOT NULL,
  `valor_total` decimal(7,2) DEFAULT NULL,
  `data_venda` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `usr_id` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `excluido` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_venda`
--

INSERT INTO `tb_venda` (`id_venda`, `id_usr`, `valor_total`, `data_venda`, `usr_id`, `id_cliente`, `excluido`) VALUES
(1, 3, '24.50', '2021-11-15 21:42:36', 0, 1, 0),
(2, 4, '27.20', '2021-11-15 21:42:42', NULL, 1, 0),
(4, 6, '50.40', '2021-11-21 02:53:17', NULL, 1, 0),
(5, 6, '15.60', '2021-11-21 23:59:09', NULL, 6, 0),
(6, 6, '16.25', '2021-11-24 00:54:54', NULL, 8, 0),
(7, 6, '49.75', '2021-11-24 21:48:09', NULL, 1, 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_cargo`
--
ALTER TABLE `tb_cargo`
  ADD PRIMARY KEY (`id_cargo`);

--
-- Índices para tabela `tb_categoria`
--
ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Índices para tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `tb_usuario_tb_cliente_fk` (`id_usr`);

--
-- Índices para tabela `tb_item_venda`
--
ALTER TABLE `tb_item_venda`
  ADD PRIMARY KEY (`id_item`),
  ADD KEY `tb_produto_tb_item_venda_fk` (`id_produto`),
  ADD KEY `tb_venda_tb_item_venda_fk` (`id_venda`);

--
-- Índices para tabela `tb_produto`
--
ALTER TABLE `tb_produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `tb_categoria_tb_produto_fk` (`id_categoria`);

--
-- Índices para tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`id_usr`),
  ADD KEY `tb_cargo_tb_usuario_fk` (`id_cargo`);

--
-- Índices para tabela `tb_venda`
--
ALTER TABLE `tb_venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `tb_cliente_tb_venda_fk` (`id_cliente`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_cargo`
--
ALTER TABLE `tb_cargo`
  MODIFY `id_cargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tb_categoria`
--
ALTER TABLE `tb_categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `tb_item_venda`
--
ALTER TABLE `tb_item_venda`
  MODIFY `id_item` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `tb_produto`
--
ALTER TABLE `tb_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `id_usr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `tb_venda`
--
ALTER TABLE `tb_venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  ADD CONSTRAINT `tb_usuario_tb_cliente_fk` FOREIGN KEY (`id_usr`) REFERENCES `tb_usuario` (`id_usr`);

--
-- Limitadores para a tabela `tb_item_venda`
--
ALTER TABLE `tb_item_venda`
  ADD CONSTRAINT `tb_produto_tb_item_venda_fk` FOREIGN KEY (`id_produto`) REFERENCES `tb_produto` (`id_produto`),
  ADD CONSTRAINT `tb_venda_tb_item_venda_fk` FOREIGN KEY (`id_venda`) REFERENCES `tb_venda` (`id_venda`);

--
-- Limitadores para a tabela `tb_produto`
--
ALTER TABLE `tb_produto`
  ADD CONSTRAINT `tb_categoria_tb_produto_fk` FOREIGN KEY (`id_categoria`) REFERENCES `tb_categoria` (`id_categoria`);

--
-- Limitadores para a tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD CONSTRAINT `tb_cargo_tb_usuario_fk` FOREIGN KEY (`id_cargo`) REFERENCES `tb_cargo` (`id_cargo`);

--
-- Limitadores para a tabela `tb_venda`
--
ALTER TABLE `tb_venda`
  ADD CONSTRAINT `tb_cliente_tb_venda_fk` FOREIGN KEY (`id_cliente`) REFERENCES `tb_cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
