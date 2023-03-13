## What's this?
This is an example on how the `transient` keyword works in Java.

This will create a `MyData` object, serialize it to a file on the desktop and deserialize it back to a new object and then print both objects to the console.

Does this for a binary file and an XML file.


## How to Launch
- Have a JRE (Java 17 or later) available
- Open terminal on root folder
- Call

`./run.sh` or `run.bat`


### Alternatively: Compile and Run
#### Compile
`javac -d bin/ -cp src src/org/ingomohr/transientexample/*.java`

- `d`: destination directory for the class files
- `cp`: classpath

#### Run
`java -cp bin org.ingomohr.transientexample.App`


### Output
```
Data before writing to file
 - MyData [myInt=42, s=s, ts=ts, fts=fts]

Data after reading back from binary file
 - MyData [myInt=42, s=s, ts=null, fts=fts]

Data after reading back from XML file
 - MyData [myInt=42, s=s, ts=null, fts=fts]
 ```
