# Tyrian counter example

This is a minimal working project setup to run the counter example.

To run the program in a browser you will need to have yarn (or npm) installed.

On first run:
to compile sources
```sh
sbt clean fastLinkJS
```

then to install js dependencies
```sh
yarn install
```

and from then on to expose server

```sh
yarn start
```

Then navigate to [http://localhost:1234/](http://localhost:1234/)

