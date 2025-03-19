//JVM has following:

//classLoader: it scans all the classes in the file
//Runtime memory areas - method, heap, stack, pc register, native method stack
//execution engine - interpreter, JIT compiler, Garbage collector

//pc register tracks the current instructions being excuted in a thread. Every thread has different pc register

//native method is a method that is implemented in language other than java, typically in c or c++. These methods allow java applications to interact with platform specific functionalities

//JIT Compiler - it detects frequently executed bytecode and compiles it into native machine code for faster execution.