(defproject mvn-shade-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]

  :resource-paths ["src/main/clojure"
                   "src/main/resources"]

  ;;:main shade.main

  :pom-plugins [[org.apache.maven.plugins/maven-shade-plugin "2.4.3"
                 {:executions
                  ([:execution
                    ([:id "shade-jar"]
                     [:phase "package"]
                     [:goals [:goal "shade"]]
                     [:configuration
                      [:createDependencyReducedPom false]])])}]])
