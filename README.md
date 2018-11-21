# maven-surefire

Experiment with a build that has 2 profiles, where each profile wants to
add some arguments to the Maven surefire plugin.

In the end I solved this by introducing a property which will be modified
by one of the plugins.
