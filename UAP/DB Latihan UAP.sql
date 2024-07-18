-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 18, 2024 at 08:44 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `extraclass`
--

-- --------------------------------------------------------

--
-- Table structure for table `aquarium`
--

CREATE TABLE `aquarium` (
  `AquariumId` char(5) NOT NULL,
  `AquariumColor` varchar(50) NOT NULL,
  `AquariumCapacity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `fishspecies`
--

CREATE TABLE `fishspecies` (
  `FishSpeciesId` char(5) NOT NULL,
  `FishSpeciesName` varchar(50) DEFAULT NULL,
  `FishSpeciesType` varchar(50) DEFAULT NULL,
  `FishAmount` int(11) DEFAULT NULL,
  `AquariumId` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aquarium`
--
ALTER TABLE `aquarium`
  ADD PRIMARY KEY (`AquariumId`);

--
-- Indexes for table `fishspecies`
--
ALTER TABLE `fishspecies`
  ADD PRIMARY KEY (`FishSpeciesId`),
  ADD KEY `AquariumId` (`AquariumId`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `fishspecies`
--
ALTER TABLE `fishspecies`
  ADD CONSTRAINT `fishspecies_ibfk_1` FOREIGN KEY (`AquariumId`) REFERENCES `aquarium` (`AquariumId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
