rm -rf ./.out/ 
mkdir ./.out/
cd ./.out/
touch "openm.jar"
cd ../java/
javac Main.java FileOps.java
jar cvfm ../.out/openm.jar ../buildfiles/MANI.mf *
cd ..
java -jar ./.out/openm.jar -h