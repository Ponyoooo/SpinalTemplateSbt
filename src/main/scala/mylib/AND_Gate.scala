package mylib

import spinal.core._

class AND_Gate extends Component {
  /*
  * io definition
  * */
  val io = new Bundle {
    val a = in Bool()
    val b = in Bool()
    val c = out Bool()
  }

  /*
  * Combine logic definition
  * */
  io.c := io.a & io.b
}

object AND_Gate_Verilog {
  def main(args: Array[String]): Unit = {
    SpinalVerilog(new AND_Gate)
  }
}

object AND_Gate_VerilogWithCustomConfig {
  def main(args: Array[String]): Unit = {
    MySpinalConfig.generateVerilog(new AND_Gate)
  }
}
