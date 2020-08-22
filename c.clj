(defn quine
  []
  (print (slurp (:file (meta #'quine)))))

(quine)
