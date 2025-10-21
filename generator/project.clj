(defproject io.jepsen/generator "0.1.0-SNAPSHOT"
  :description "Pure functional generators for Jepsen tests"
  :url "https://github.com/jepsen-io/jepsen"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[fipp "0.6.29"] ; Just so we can explain HOW to pretty-print generators
                 [io.jepsen/history "0.1.5"]
                 [org.clj-commons/primitive-math "1.0.1"]
                 [org.clojure/data.generators "1.1.0"
                  :exclusions [org.clojure/clojure]]
                 [slingshot "0.12.2"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.12.2"]
                                  [criterium "0.4.6"]]}}
  :repl-options {:init-ns user}
  :test-selectors {:default (fn [m]
                              (not (:perf m)))
                   :focus :focus
                   :perf :perf})
