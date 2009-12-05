import sbt._

class TestProject(info: ProjectInfo) extends DefaultProject(info)
{
	override def unmanagedClasspath = super.unmanagedClasspath +++ Path.fromFile(FileUtilities.sbtJar)
}
