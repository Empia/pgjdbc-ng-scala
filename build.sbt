lazy val root = (project in file(".")).
settings(
  name := "scalaClassifier",
  version := "0.0.1",
  scalaVersion := "2.11.7",
  mainClass := Some("Main"),

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",


   libraryDependencies += "com.impossibl.pgjdbc-ng" % "pgjdbc-ng" % "0.7.0-SNAPSHOT"
   //libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
   //libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.5.0",
)
