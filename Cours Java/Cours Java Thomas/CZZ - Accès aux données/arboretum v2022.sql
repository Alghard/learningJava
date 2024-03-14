-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 23 Mars 2021 à 22:12
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `arboretum`
--

-- --------------------------------------------------------

--
-- Structure de la table `arbre`
--

CREATE TABLE `arbre` (
  `id` int(10) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `anneePlantation` int(5) NOT NULL DEFAULT '2021',
  `photo` varchar(300) DEFAULT NULL,
  `idEspece` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `arbre`
--

INSERT INTO `arbre` (`id`, `description`, `anneePlantation`, `photo`, `idEspece`) VALUES
(1, 'petit araucaria', 1990, NULL, 'ARA'),
(2, 'grand araucaria', 2021, NULL, 'ARA'),
(3, 'grand bouleau', 1987, NULL, 'BOUV'),
(4, 'petit bouleau', 2000, NULL, 'BOUV'),
(5, 'petit bunya-bunya', 1975, NULL, 'BUN'),
(6, 'bunya-bunya 2', 1978, NULL, 'BUN'),
(7, 'grand cèdre', 1870, NULL, 'CEDA'),
(8, 'très vieux cèdre', 1800, NULL, 'CEDL'),
(9, 'beau cèdre', 1930, NULL, 'CEDB'),
(10, 'joli cèdre', 1896, NULL, 'CEDB'),
(11, 'jeune cèdre', 1940, NULL, 'CEDC'),
(12, 'vieux cèdre', 1920, NULL, 'CEDH'),
(13, 'vieux cerisier', 1960, NULL, 'CERC'),
(14, 'beau cerisier', 1970, NULL, 'CERJ'),
(15, 'vieux chêne rouge', 1951, NULL, 'CHER'),
(16, 'chêne rouge malade', 1954, NULL, 'CHER'),
(17, 'jeune cyprès', 2007, NULL, 'CYPC'),
(18, 'beau cyprès', 1970, NULL, 'CYPCO'),
(19, 'beau cyprès 2', 1975, NULL, 'CYPM'),
(20, 'beau cyprès 3', 1964, NULL, 'CYPM'),
(21, 'petit épicéa', 1975, NULL, 'EPIC'),
(22, 'viel érable', 1930, NULL, 'ERAP'),
(23, 'très grand érable', 1896, NULL, 'ERAS'),
(24, 'jeune érable', 1975, NULL, 'ERAS'),
(25, 'genévrier', 1970, NULL, 'GENC'),
(26, 'jeune arbre', 2001, NULL, 'GENCA'),
(27, 'viel arbre tordu', 1896, NULL, 'GENCH'),
(28, 'arbre', 1960, NULL, 'GENP'),
(29, 'bel arbre', 1920, NULL, 'GINK'),
(30, 'gommier cidre', 1940, NULL, 'GOMC'),
(31, 'vieux gommier cidre', 1896, NULL, 'GOMC'),
(32, 'beau gommier cidre', 1930, NULL, 'GOMG'),
(33, 'gommier noir', 1920, NULL, 'GOMN'),
(34, 'bel hévéa', 1951, NULL, 'HEVE'),
(35, 'viel arbre gris', 1920, NULL, 'IFC'),
(36, 'beau marronnier', 1937, NULL, 'MARI'),
(37, 'jeune mélèze', 2021, NULL, 'MELE'),
(38, 'jeune orme', 2007, NULL, 'ORMC'),
(39, 'peuplier blanc', 1954, NULL, 'PEUB'),
(40, 'peuplier noir', 1960, NULL, 'PEUN'),
(41, 'joli pin', 1970, NULL, 'PINA'),
(42, 'vieux tulipier', 1800, NULL, 'TULV'),
(43, 'jeune tulipier', 1954, NULL, 'TULV'),
(44, 'beau pin', 1960, NULL, 'PINA'),
(45, 'pin bizarre', 1954, NULL, 'PINP'),
(46, 'vieux pin', 1930, NULL, 'PINS'),
(47, 'arbre très rare', 2010, NULL, 'PINW'),
(48, 'grand platane', 1930, NULL, 'PLAC'),
(49, 'vieux sapin', 1905, NULL, 'SAPA'),
(50, 'beau sapin', 1940, NULL, 'SAPC'),
(51, 'spin malade', 1943, NULL, 'SAPN'),
(52, 'beau saule', 1902, NULL, 'SAUP'),
(53, 'arbre géant', 1891, NULL, 'SEQG'),
(54, 'vieux et beau séquoia', 1900, NULL, 'SEQS'),
(55, 'sumac', 1954, NULL, 'SUMV'),
(56, 'grand Thuya', 1939, NULL, 'THUC'),
(57, 'vieux Thuya', 1921, NULL, 'THUO'),
(58, 'Thuya malade', 1930, NULL, 'THUP'),
(59, 'beau Thuya', 1920, NULL, 'THUP');

-- --------------------------------------------------------

--
-- Structure de la table `continent`
--

CREATE TABLE `continent` (
  `id` varchar(30) NOT NULL,
  `nom` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `continent`
--

INSERT INTO `continent` (`id`, `nom`) VALUES
('AFRI', 'Afrique'),
('AMEN', 'Amérique Nord'),
('AMES', 'Amérique Sud'),
('ASIE', 'Asie Est'),
('ASIO', 'Asie Ouest'),
('EURO', 'Europe'),
('OCEA', 'Océanie');

-- --------------------------------------------------------

--
-- Structure de la table `espece`
--

CREATE TABLE `espece` (
  `id` varchar(20) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `nomScientifique` varchar(300) NOT NULL,
  `idContinent` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `espece`
--

INSERT INTO `espece` (`id`, `nom`, `nomScientifique`, `idContinent`) VALUES
('ARA', 'araucaria du Chili', 'Araucaria araucana', 'AMES'),
('BOUV', 'bouleau verruqueux', 'Betula pendula', 'EURO'),
('BUN', 'bunya-bunya', 'Araucaria bidwillii', 'OCEA'),
('CEDA', 'cèdre de l\'Atlas', 'Cedrus atlantica', 'ASIO'),
('CEDB', 'cèdre blanc', 'Calocedrus decurrens', 'AMEN'),
('CEDC', 'cèdre de Chypre', 'Cedrus brevifolia', 'EURO'),
('CEDH', 'cèdre de l\'Himalaya', 'Cedrus deodara', 'ASIE'),
('CEDL', 'cèdre du Liban', 'Cedrus libani', 'ASIO'),
('CERC', 'cerisier de Cayenne', 'Eugenia uniflora', 'AMES'),
('CERJ', 'cerisier du Japon', 'Prunus serrulata', 'ASIE'),
('CHER', 'chêne rouge d\'Amérique', 'Quercus rubra', 'AMEN'),
('CYPC', 'cyprès chauve', 'Taxodium distichum', 'AMEN'),
('CYPCO', 'cyprès commun', 'Cupressus sempervirens', 'ASIO'),
('CYPM', 'cyprès de Monterey', 'Cupressus macrocarpa', 'AMEN'),
('EPIC', 'épicéa commun', 'Picea abies', 'EURO'),
('ERAP', 'érable plane', 'Acer platanoides', 'EURO'),
('ERAS', 'érable à sucre', 'Acer saccharum', 'AMEN'),
('GENC', 'genévrier commun', 'Juniperus communis', 'EURO'),
('GENCA', 'genévrier cade', 'Juniperus oxycedrus', 'AFRI'),
('GENCH', 'genévrier de Chine', 'Juniperus chinensis', 'ASIE'),
('GENP', 'genévrier de Phénicie', 'Juniperus phoenicea', 'AFRI'),
('GINK', 'ginkgo', 'Ginkgo biloba', 'ASIE'),
('GOMC', 'gommier cidre', 'Eucalyptus gunnii', 'OCEA'),
('GOMG', 'gommier gris', 'Eucalyptus major', 'OCEA'),
('GOMN', 'gommier noir', 'Eucalyptus largiflorens', 'OCEA'),
('HEVE', 'arbre à caoutchouc', 'Hevea brasiliensis', 'AMES'),
('IFC', 'if commun', 'Taxus baccata', 'EURO'),
('MARI', 'marronnier d\'Inde', 'Aesculus hippocastanum', 'ASIO'),
('MELE', 'mélèze d\'Europe', 'Larix decidua', 'EURO'),
('ORMC', 'orme champêtre', 'Ulmus minor', 'EURO'),
('PEUB', 'peuplier blanc', 'Populus alba', 'EURO'),
('PEUN', 'peuplier noir', 'Populus nigra', 'EURO'),
('PINA', 'pin des Alpes', 'Pinus cembra', 'EURO'),
('PINM', 'pin de Monterey', 'Pinus radiata', 'AMEN'),
('PINP', 'pin parasol', 'Pinus pinea', 'EURO'),
('PINS', 'pin sylvestre', 'Pinus sylvestris', 'EURO'),
('PINW', 'pin de Wollemi', 'Wollemia nobilis', 'OCEA'),
('PLAC', 'platane commun', 'Platanus x acerifolia', 'EURO'),
('SAPA', 'sapin d\'Andalousie', 'Abies pinsapo', 'EURO'),
('SAPC', 'sapin commun', 'Abies alba', 'EURO'),
('SAPN', 'sapin de Nordmann', 'Abies nordmanniana', 'ASIO'),
('SAPS', 'sapin de Sibérie', 'Abies sibirica', 'ASIE'),
('SAUP', 'saule pleureur', 'Salix babylonica', 'ASIE'),
('SEQG', 'séquoia géant', 'Sequoiadendron giganteum', 'AMEN'),
('SEQS', 'séquoia toujours vert', 'Sequoia sempervirens', 'AMEN'),
('SUMV', 'sumac vinaigrier', 'Rhus typhina', 'AMEN'),
('THUC', 'thuya de Corée', 'Thuya koraiensis', 'ASIE'),
('THUO', 'thuya du Canada', 'Thuya occidentalis', 'AMEN'),
('THUP', 'thuya géant de Californie', 'Thuya plicata', 'AMEN'),
('TULV', 'tulipier de Virginie', 'Liriodendron tulipifera', 'AMEN');

-- --------------------------------------------------------

--
-- Structure de la table `visite`
--

CREATE TABLE `visite` (
  `id` int(10) NOT NULL,
  `dateVisite` date NOT NULL,
  `heureVisite` int(3) DEFAULT NULL,
  `prix` float NOT NULL DEFAULT '0',
  `nbPlaces` int(3) NOT NULL DEFAULT '15',
  `titre` varchar(300) DEFAULT NULL,
  `conferencier` varchar(200) DEFAULT NULL,
  `nomGuide` varchar(200) DEFAULT NULL,
  `duree` int(3) NOT NULL DEFAULT '60',
  `typeVisite` enum('conference','visiteGuidee','visiteLibre') NOT NULL DEFAULT 'visiteLibre'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `visite`
--

INSERT INTO `visite` (`id`, `dateVisite`, `heureVisite`, `prix`, `nbPlaces`, `titre`, `conferencier`, `nomGuide`, `duree`, `typeVisite`) VALUES
(1, '2018-01-10', 14, 5, 15, NULL, NULL, 'Sophie Lantier', 60, 'visiteGuidee'),
(2, '2018-02-15', 10, 6, 15, NULL, NULL, 'Sophie Lantier', 60, 'visiteGuidee'),
(3, '2020-05-06', 15, 6, 15, NULL, NULL, 'Sophie Lantier', 60, 'visiteGuidee'),
(4, '2019-03-19', 14, 7, 15, NULL, NULL, 'Stefan Martinu', 60, 'visiteGuidee'),
(5, '2019-04-01', 10, 0, 15, NULL, NULL, 'Stefan Martinu', 60, 'visiteGuidee'),
(6, '2022-12-20', 14, 6, 15, NULL, NULL, 'Sophie Lantier', 60, 'visiteGuidee'),
(7, '2022-04-03', 10, 6, 15, NULL, NULL, 'Stefan Martinu', 60, 'visiteGuidee'),
(8, '2022-07-11', 10, 6, 15, NULL, NULL, 'Stefan Martinu', 60, 'visiteGuidee'),
(9, '2022-07-14', 14, 0, 20, 'La forêt primaire', 'Francis Hallé', NULL, 90, 'conference'),
(10, '2021-06-30', 17, 0, 20, 'Protéger la forêt', 'Francis Hallé', NULL, 90, 'conference'),
(11, '2022-08-18', 17, 0, 30, 'Connaître les arbres', 'Francis Hallé', NULL, 120, 'conference'),
(12, '2022-09-14', 10, 0, 20, 'Les arbres remarquables', 'Roger Fetterman', NULL, 90, 'conference'),
(13, '2019-06-15', 9, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(14, '2019-07-01', 9, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(15, '2020-09-14', 13, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(16, '2020-09-21', 9, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(17, '2021-06-15', 9, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(18, '2021-07-30', 10, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(19, '2021-08-11', 14, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre'),
(20, '2021-09-02', 10, 5, 15, NULL, NULL, NULL, 120, 'visiteLibre');

-- --------------------------------------------------------

--
-- Structure de la table `visiteur`
--

CREATE TABLE `visiteur` (
  `id` int(10) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `tel` varchar(50) NOT NULL,
  `nbPersonnes` int(3) NOT NULL DEFAULT '1',
  `idvisite` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `visiteur`
--

INSERT INTO `visiteur` (`id`, `nom`, `prenom`, `tel`, `nbPersonnes`, `idvisite`) VALUES
(1, 'Dumont', 'Olivier', '0632659801', 3, 1),
(2, 'Ba', 'Aminata', '0712458956', 2, 1),
(3, 'Morville', 'Joey', '0632659745', 1, 1),
(4, 'Diallo', 'Fanta', '0698762145', 4, 2),
(5, 'Lajoie', 'Karl', '0612345679', 2, 2),
(6, 'Hakan', 'Violette', '0698765342', 3, 3),
(7, 'Mechkour', 'Saib', '0612345645', 2, 3),
(8, 'Cherpion', 'François', '0687541203', 5, 4),
(9, 'Valmorin', 'Christiane', '0798765402', 4, 6),
(10, 'Hermine', 'Christelle', '0678945612', 1, 6),
(11, 'Dubourg', 'Alain-François', '0632106598', 7, 7),
(12, 'Jackson', 'Michel', '0701020304', 2, 7),
(13, 'Prince', 'Joël', '0698754179', 4, 8),
(14, 'Capdevielle', 'Thomas', '0765432112', 1, 8),
(15, 'Sakho', 'Aminata', '0698787980', 3, 8),
(16, 'Angels', 'Frédéric', '0798865310', 1, 9),
(17, 'Perez', 'Marco', '0765432986', 2, 10),
(18, 'Jobim', 'Tom', '0698759864', 3, 10),
(19, 'Dolto', 'Carlos', '0632106505', 4, 10),
(20, 'Fernandez', 'Paco', '0601235678', 2, 11),
(21, 'Boulez', 'Pierre', '0607060706', 2, 12),
(22, 'Dupain', 'Marion', '0632165487', 6, 12),
(23, 'Roquai', 'Jamie', '0600112233', 5, 13),
(24, 'Pickett', 'Wilson', '0654987320', 2, 13),
(25, 'Jankevic', 'Maria', '0632165497', 2, 14),
(26, 'Person', 'Nina', '0765432160', 2, 15),
(27, 'Menchu', 'Berta', '0654326454', 4, 15),
(28, 'Miles', 'David', '0687987987', 4, 16),
(29, 'Beaupin', 'Alexandre', '0687879865', 2, 17),
(30, 'Martinov', 'Wladimir', '0760349597', 3, 17),
(31, 'Dutronc', 'Fanny', '0732106549', 2, 18),
(32, 'Dakin', 'Thomas', '0654654987', 2, 18),
(33, 'Stahl', 'Céline', '0670708780', 1, 18),
(34, 'Wozniak', 'Steve', '0687987654', 2, 19),
(35, 'Cook', 'Alicia', '0687653210', 4, 19),
(36, 'Dunor', 'Hagar', '0687987650', 3, 20),
(37, 'Soumri', 'Sana', '0765432100', 5, 20);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `arbre`
--
ALTER TABLE `arbre`
  ADD PRIMARY KEY (`id`),
  ADD KEY `arbre_ibfk_1` (`idEspece`);

--
-- Index pour la table `continent`
--
ALTER TABLE `continent`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `espece`
--
ALTER TABLE `espece`
  ADD PRIMARY KEY (`id`),
  ADD KEY `espece_ibfk_1` (`idContinent`);

--
-- Index pour la table `visite`
--
ALTER TABLE `visite`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `visiteur_ibfk_1` (`idvisite`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `arbre`
--
ALTER TABLE `arbre`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
--
-- AUTO_INCREMENT pour la table `visite`
--
ALTER TABLE `visite`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT pour la table `visiteur`
--
ALTER TABLE `visiteur`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `arbre`
--
ALTER TABLE `arbre`
  ADD CONSTRAINT `arbre_ibfk_1` FOREIGN KEY (`idEspece`) REFERENCES `espece` (`id`);

--
-- Contraintes pour la table `espece`
--
ALTER TABLE `espece`
  ADD CONSTRAINT `espece_ibfk_1` FOREIGN KEY (`idContinent`) REFERENCES `continent` (`id`);

--
-- Contraintes pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD CONSTRAINT `visiteur_ibfk_1` FOREIGN KEY (`idVisite`) REFERENCES `visite` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
