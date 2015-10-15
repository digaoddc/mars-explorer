# MarsExplorer

A library to simulate that multiple explorers were sent to mars, landed on a plateau and need to move around through commands to send video back to earth .

Each explorer starts with (x, y) coordinates and a direction. Eg: (0, 0, N) . It means the explorer is on the center of plateau and turned to North .

Explorers can receive commands to move or turn 90 degress to right or left

Possible commands are "L", "R" and "M". From those, "L" and "R" make the explorer turn 90 degress to right or left, and "M" is to move to any direction explorer is pointed to .


## Installation

1. Import to your workspace as a Maven project
2. Set Tomcat as your runtime server



## Usage




## Examples
```
Start coordinates - 1 2 N
Commands          - LMLMLMLMM
Expected Output   - 1 3 N
```
```
Start coordinates - 3 3 E
Commands          - MMRMMRMRRM
Expected Output   - 5 1 E
```

## Contributing

### Source

The source for this project is now kept at GitHub:

https://github.com/digaoddc/mars-explorer

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request