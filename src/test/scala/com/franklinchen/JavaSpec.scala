package com.franklinchen

import org.specs2._

import scala.collection.JavaConverters._

/** Do we get the overloaded method taking a Collection or not? */
class JavaSpec extends Specification { def is = s2"""
  ${`call overloaded variadic Java method with splat`}
  ${`call overloaded variadic Java method without splat`}
  ${`call overloaded variadic Java method with Collection[AnyRef]`}
  ${`call overloaded variadic Java method with Collection[Any]`}
  """

  def `call overloaded variadic Java method with splat` = {
    new Java().luckyNumber(List("stuff"): _*) ==== 42
  }

  def `call overloaded variadic Java method without splat` = {
    new Java().luckyNumber(List("stuff").asJava) ==== 42
  }

  /** The only one that works. */
  def `call overloaded variadic Java method with Collection[AnyRef]` = {
    new Java().luckyNumber(List("stuff": AnyRef).asJava) ==== 42
  }

  def `call overloaded variadic Java method with Collection[Any]` = {
    new Java().luckyNumber(List("stuff": Any).asJava) ==== 42
  }
}
