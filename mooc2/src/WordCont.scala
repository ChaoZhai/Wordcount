import org.apache.spark.SparkContext

object WordCont {
  def main(args: Array[String]): Unit = {
    var sc=new SparkContext("local","wordcount")
    var file=sc.textFile("C:\\newcastle\\CSC8101\\spark-3.0.0-preview2-bin-hadoop2.7\\LICENSE")
    file.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_).foreach(println(_))

  }


}
