<?php

$panier  = array();

$panier["orange"] = 5;
$panier["citron"] = 1;
$panier["pomme"] = 6;
$panier["poire"] = 3;

//print_r($panier);

//var_dump($panier);

foreach($panier as $cle => $valeur)
{
	echo "$cle : $valeur";
	echo "<br>";
}

echo "taille du tableau : " . count($panier) . "<br>";

$panier["kiwi"] = 10;

foreach($panier as $cle => $valeur)
{
	echo "$cle : $valeur";
	echo "<br>";
}

unset( $panier["pomme"] );

foreach($panier as $cle => $valeur)
{
	echo "$cle : $valeur";
	echo "<br>";
}
?>