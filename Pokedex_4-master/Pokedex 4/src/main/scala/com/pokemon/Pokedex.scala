package com.pokedex

import okhttp3.{OkHttpClient, Request}
import scala.io.Source
import scala.io.StdIn.readLine
import scala.util.control.NonFatal

// class PokedexGET(name: String, type1: String) {
//   override def toString: String = s"""${name.capitalize}:
//     |==============================
//     |Name: $name
//     |Type: $type1"""
// }
object PokedexGET {
  def main(args: Array[String]): Unit = {
    val name = readLine()
          val http = "https://pokeapi.co/api/v2/pokemon/"+name
          val result = scala.io.Source.fromURL(http).mkString
          println(result)
          println(http)
  }
}
object PokedexGETType {

  def main(args: Array[String]): Unit = {     
          val typee = readLine()
          val http = "https://pokeapi.co/api/v2/type/"+typee+"/"
          val result = scala.io.Source.fromURL(http).mkString
          println(result)
          println(http)
  }}

object PokedexGETGeneration {
  def main(args: Array[String]): Unit = {
            print("Quelle generation de pokemon vous interesse ?")
          val gen = readLine()
          val http = "https://pokeapi.co/api/v2/generation/"+gen
          val result = scala.io.Source.fromURL(http).mkString
          println(result)
          println(http)
  }
}

object PokedexGETRegion {
  def main(args: Array[String]) : Unit = {
    print("Quel region vous interesse ?")
    val region = readLine()
    val http = "https://pokeapi.co/api/v2/region/"+region
    val result = scala.io.Source.fromURL(http).mkString
    println(result)
    println(http)
  }
}

object PokedexGETLegendary{
  def main(args: Array[String]): Unit = {
    print("Quel pokemon vous interesse ?")
    val legendary = readLine()
    val http = "https://pokeapi.co/api/v2/pokemon-species/"+legendary
    val result = scala.io.Source.fromURL(http).mkString
    println(result)
    println(http)
  }
}


object PokedexWHEREIS {

  def main(args: Array[String]): Unit = {
    print("Entrez le pokemon souhaité: ")
      val pokemon = readLine()
      val http = "https://pokeapi.co/api/v2/pokemon/"+pokemon+"/encounters"
      val result = scala.io.Source.fromURL(http).mkString
      println(result)
      println(http)
  }
}
object PokedexMATCH {

  def main(args: Array[String]): Unit = println("empty")
}



