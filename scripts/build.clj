(require 'cljs.closure)

(cljs.closure/build
  "src"
  {:main 'lame.core
   :output-to "out/main.js"})
