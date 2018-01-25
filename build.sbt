name := "Dura_dzinza"
 
version := "1.0" 
      
lazy val `dura_dzinza` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice,
  "org.apache.jena" % "apache-jena-libs" % "3.4.0",
  "org.apache.jena" % "jena-fuseki-embedded" % "3.4.0")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      