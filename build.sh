rm -rf ./.out/
rm -rf ./.javaout/
mkdir ./.out/
cd ./.out/
touch "openm.jar"
cd ../java/
javac Main.java FileOps.java Resc.java ErrorHan.java -d ../.javaout/
cd ../.javaout/
jar cvfm ../.out/openm.jar ../buildfiles/MANI.mf *
cd ../.out/
java -jar openm.jar -h
java -jar openm.jar --error 00
java -jar openm.jar --error 01
java -jar openm.jar --error 02
java -jar openm.jar --error zz
java -jar openm.jar