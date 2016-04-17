package com.saddham.bootstrap.maven.plugin.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Created by saddhamp on 11/4/16.
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}")
    private MavenProject project;

    @Parameter(property = "name", defaultValue = "${owner.name}")
    private String _name;

    @Parameter(defaultValue = "Hi")
    private String greeting;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(project.getArtifactId());
        getLog().info(greeting+" "+ _name);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
