(ns forca.core
  (:gen-class))

(def total-de-vidas 6)
(defn perdeu [] (print "Você perdeu"))
(defn jogo [vidas]
    (if(= vidas 0)
        (perdeu)
        (do
            (print vidas)
            (jogo (dec vidas))
        )
    )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn fib [n]
    (if(= n 0)
        (print "0")
    )
    (if(= n 1)
        (print "1")
    )
    (if(> n 1)
        (print (+ fib(- n 1) fib(- n 2)))
    )
)
