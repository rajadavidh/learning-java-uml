# Learning to translate UML diagram into Java
Examples for learning to translate UML diagram into Java code

### UML Diagram
![Faculty Information System](https://github.com/rajadavidh/learning-java-uml/blob/master/img/umlFacultyInformationSystem.jpg)

### Directory structure
```
/src  --> Contains driver class and other components
/img  --> Contains UML diagram
```

### Download entire repository
Clone remote repository using command:
```
git clone https://github.com/rajadavidh/learning-java-uml.git
```

### Setup local repository and Push to remote repository
1. Create remote repository from github webpage
1. Create new local repository:
   ```
   git init
   git status
   git add -A
   ```
1. Commit changes on local repository:
   ```
   git commit -m "initial commit"
   ```
1. Add a remote repository:
   ```
   # Set a new remote
   git remote add origin https://github.com/rajadavidh/learning-java-uml.git
   # Verify new remote
   git remote -v
   ```
1. Upload local branch commits to remote repository:
   ```
   git push -u origin master
   ```
