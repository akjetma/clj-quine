(let [s "(let [s %s] (println (format s (pr-str s))))"] (println (format s (pr-str s))))
