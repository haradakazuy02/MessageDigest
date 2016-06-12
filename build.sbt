lazy val root = (project in file(".")).settings(
 name := "MD",
 version := "0.1",
 autoScalaLibrary := false,
 packageOptions in (Compile,packageBin) += Package.ManifestAttributes(java.util.jar.Attributes.Name.MAIN_CLASS -> "jp.gr.java_conf.harada.MD")
)
