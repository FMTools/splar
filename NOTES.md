# NOTES

## Release Notes

v.1.0.0.

* Build based on maven

v.1.0.1

* Cleanup of code (removal of warnings and dead code)
* Change json dependency from v20141113 to v20140107 to [avoid warnings/errors with Java v7][json-java7]
* Move some existing tests from src/main to src/tests (moved the splar.apps, splar.apps.expriments and splar.plugins.reasoners.tests packages)

[json-java7]: http://stackoverflow.com/questions/27352672/how-to-use-the-org-json-java-library-with-java-7