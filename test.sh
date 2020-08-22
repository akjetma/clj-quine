#!/bin/sh

clj a.clj > a2.clj
diff -s a.clj a2.clj

clj b.clj > b2.clj
diff -s b.clj b2.clj

clj c.clj > c2.clj
diff -s c.clj c2.clj

rm a2.clj b2.clj c2.clj
