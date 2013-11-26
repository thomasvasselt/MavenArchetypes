# Webproject archetype
This project contains a Maven 3.0 webproject archetype, with JAX-RS dependancies

## How to install
Clone this archetype, and build and install it to your local repository by running `mvn install`

## How to use
Once you installed it, you can create projects based on this archetype by running the command

``mvn archetype:generate -DarchetypeGroupId=nl.saxionact -DarchetypeArtifactId=webproject-archetype -DarchetypeVersion=0.1``

Then it should ask you for a groupId, an artifactId and a package:

* The groupId should be filled in with a packagename, e.g. `nl.ruudgreven`

* The artifactId should be filled in with a projectname, e.g. `mywebproject`

* The package should be filled in with the package for the project, which should be the groupId followed by the artifactId, e.g. `nl.ruudgreven.mywebproject`


Edit the pom.xml to suite your needs. Check all the sections marked with a `<!-- TODO: ... -->`

## Import in Eclipse
**Note:** You need Eclipse JEE Version.

You need to configure the M2_REPO classpath in Eclipse (if you don't already have it) using the following steps:

1. Go to `Preferences -> Java -> Build Path -> Classpath Variables` and choose `new`.

2. Use the name `M2_REPO` and the Path `~/.m2/repository`

Then, you can import the project in Eclipse using the following steps

1. Run `mvn install` to build the project and receive dependencies.

2. Run `mvn eclipse:eclipse -Dwtpversion=1.5` in the project folder

3. In Eclipse, go to `File -> Import -> Existing Projects into Workspace` and choose your project folder to import.

