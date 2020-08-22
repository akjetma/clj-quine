(let [qc (char 34)
      yo [
          "(let [qc (char 34)"
          "      yo ["
          "          "
          "          ]]"
          "  (doseq [x (subvec yo 0 2)]"
          "    (println x))"
          "  (doseq [x yo]"
          "    (println (str (yo 2) qc x qc)))"
          "  (doseq [x (subvec yo 3)]"
          "    (println x)))"
          ]]
  (doseq [x (subvec yo 0 2)]
    (println x))
  (doseq [x yo]
    (println (str (yo 2) qc x qc)))
  (doseq [x (subvec yo 3)]
    (println x)))
