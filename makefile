JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
    $(JC) $(JFLAGS) $*.java

CLASSES = \
    src/javaPrint/Main.java \
    src/javaPrint/PrintElements.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
    $(RM) *.class