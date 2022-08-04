package com.pokedex.db

final case class Pokemon(
  id: Int,
  name: String,
  type1: String,
  type2: String,
  hp: Int,
  attack: Int,
  total: Int,
  defense: Int,
  spAttack: Int,
  spDefense: Int,
  speed: Int,
  generation: Int,
  legendary: Boolean
) {

  override def toString(): String =
    s"""
    ===================================
    ID: $id
    Name: $name
    Type-1: $type1
    Type-2: $type2
    Total: $total
    HP: $hp
    Attack: $attack
    Defense: $defense
    SP. Atk: $spAttack
    Def: $spDefense
    Speed: $speed
    Generation: $generation
    Legendary: $legendary
    ==================================
    """
}
