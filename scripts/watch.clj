(require 'cljs.closure)

(cljs.closure/watch "src"
  {:main 'lame.core
   :output-to "out/main.js"})
