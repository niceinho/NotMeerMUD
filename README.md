# MeerMud
## What is it?
This is a small quarter-year project created by a couple Meermans underlings

## To programmers:
- **Don't add/commit every single file** please... This makes commit messages messy

## Branches
- feature/branchName - adding new features; branch/merge -> dev
- dev/branchName - making base code; branch/merge -> master
- release/branchName - fixing bugs; branch -> dev; merge -> master/dev
- hotfix/branchName - urgent coding; branch -> master; merge -> master/dev

## Basic Code Format
### Variables
- kVarName - constant
- mVarName - field variables
- pVarName - parameter variables
- VAR_NAME - FINAL
#### Examples:
```
public class ExampleClass {
  //FINAL
  Double ACCEL_GRAVITY = 9.80665;
  
  //Constant
  ExampleClass kExampleClassFinal = this;
  
  //Field Variable
  Number mExampleField;
  
  //Constructor
  public ExampleClass(Number pVarName) {
    mExampleField = pVarName;
  }
}
```

## Credits
- Francis Adams
- Joseph Chang
- Kyle Robinson
