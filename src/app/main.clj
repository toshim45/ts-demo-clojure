(ns app.main)

(defn -main [& args]
  (println "Hello Clojure")
  (if (seq args)
    (doseq [arg args]
      (println arg))
    (println "-")))