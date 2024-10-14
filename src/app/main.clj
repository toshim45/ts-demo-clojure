(ns app.main)

;; multi method of an animal
;; style implicit definition
;; (defmulti bark (fn [animal] (:variety animal)))
;; (defmethod bark :dog [animal] (println (str (:name animal) ", guk-guk")))
;; (defmethod bark :cat [animal] (println (str (:name animal) ", miaow")))
;;
;; some where in main => (bark {:variety :cat :name "kucing"})
;;
;; sytle explicit definition
(defmulti bark :animal)
(defn dog [n] {:animal :dog :name n})
(defn ant [] {:animal :ant :name "ant"})
(defmethod bark :dog [d] (println (:name d) ", guk-guk"))
(defmethod bark :ant [a] (println (:name a) ", oek-oek"))
;;
;; somewhere in main => (bark (dog "dog")) | (bark (ant))
;; 

;; main function
(defn -main [& args]
  (println "Hello Clojure")
  (if (seq args)
    (doseq [arg args]
      (println arg))
    (println "-"))
  (bark (ant)))