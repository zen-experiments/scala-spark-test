package example

import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest.{BeforeAndAfter, FunSpec, Matchers}

object HelloSpec {
  private val MASTER_URL = "local"//"spark://mac-dmitryn.local:7077"
}

class HelloSpec extends FunSpec with Matchers with BeforeAndAfter {
  var conf: SparkConf = _
  var sparkContext: SparkContext = _

  before {
    conf = new SparkConf()
      .setMaster(HelloSpec.MASTER_URL)
      .setAppName("Scala Spark Test")
      .setJars(Seq("target/scala-2.11/scala-spark-test_2.11-0.0.1-alpha.2.jar"))

    sparkContext = new SparkContext(conf)
  }

  after {
    sparkContext.stop()
  }

  describe("The Hello object") {
    it("should say hello") {
      assert(Hello.greeting == "hello")
    }
  }
}
