## What's this?
This is an example on how the `transient` keyword works in Java.

## How to Compile and Run
- Have a JRE (Java 17 or later) available
- Open terminal on root folder

### Compile
`javac -d bin/ -cp src src/org/ingomohr/transientexample/*.java`

- `d`: destination directory for the class files
- `cp`: classpath

### Run
`java -cp bin org.ingomohr.transientexample.App`

### Quick-Run
Call

`./run.sh`


### Output
```
Data before writing to file
 - MyData [myInt=42, s=s, ts=ts, fts=fts]
Data after reading back from file
 - MyData [myInt=42, s=s, ts=null, fts=fts]
```
