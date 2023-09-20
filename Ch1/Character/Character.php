<?php
    include "./WeaponBehavior.php";

    abstract class  Character{

        public $weapon;
        public $name;

        abstract public function fight();

        function __construct($n){
            $this -> name = $n;
        }

        function display(){
            echo "I'm ". $this -> name."\n";
            echo "(Role: " . get_class($this) . ")\n";             
        }

        function setWeapon(WeaponBehavior $choosenWeapon){
            $this -> weapon = $choosenWeapon;
        }
    }

    class King extends Character{
        function fight(){
            $this -> weapon -> useWeapon();
        }
    }

    class Queen extends Character{
        function fight(){
            $this -> weapon -> useWeapon();
        }
    }

    class Troll extends Character{
        function fight(){
            $this -> weapon -> useWeapon();
        }
    }

    class Knight extends Character{
        function fight(){
            $this -> weapon -> useWeapon();
        }
    }
?>