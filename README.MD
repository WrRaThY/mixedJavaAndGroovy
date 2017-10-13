<h1>mixedJavaAndGroovy</h1>
example project that mixes Java 8 and Groovy<br>

<h3>why I needed this</h3>

- there is a bug in IDEA that marks groovy stubs as project source, 
which means that after running maven goals IDEA would not be able to compile 
groovy code commenting that classes are duplicated...<br>
https://youtrack.jetbrains.com/issue/IDEA-153779<br>
https://github.com/groovy/GMavenPlus/issues/52

- in a simple setup there is a need to mark groovy folder manually in IDEA (or use a plugin)

<h4>Featues</h4>

- Java classes can be used from Groovy code
- Groovy classes can be used from Java code
- JUnit tests work fine
- Spock tests work fine
- IDEA will auto-detect main/groovy, main/java, test/groovy and test/java folders


<h4>most important config</h4>
<h6>gmavenplus-plugin config</h6>
folders in which stubs will be generated 

    <configuration>
        <stubsOutputDirectory>${java.io.tmpdir}/${project.groupId}.${project.artifactId}/stubs</stubsOutputDirectory>
        <testStubsOutputDirectory>${java.io.tmpdir}/${project.groupId}.${project.artifactId}/test-stubs</testStubsOutputDirectory>
    </configuration>

<h6>maven-clean-plugin config</h6>
cleaning up those folders

    <configuration>
        <filesets>
            <fileset>
                <directory>${java.io.tmpdir}/${project.groupId}.${project.artifactId}</directory>
            </fileset>
        </filesets>
    </configuration>
    
<h4>note</h4>
mixing groovy and java like that (which means mixing maven lifecycles) makes compilation slower than pure Java or pure Groovy solution