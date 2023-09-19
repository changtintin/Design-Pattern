<?php
    include "./Character.php";
    header('Content-type: text/plain');

    echo "Charles vs  Sam \n";
    $charles = new King("Charles");
    $charles -> display();
    // change the weapon anytime during the game
    $charles -> setWeapon(new SwordBehavior());
    $charles -> fight();
    $charles -> setWeapon(new ArrowBehavior());
    $charles -> fight();

    $sam = new Knight("Sam");
    $sam -> display();
    $sam -> setWeapon(new AxeBehavior());
    $sam -> fight();
?>