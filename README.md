# secure-spring-docker


Install docker. Docker will be used to mimic production deployment. We will have two containers, one running mysql and 
another running the main spring application.

The image of our app will be built using `docker-compose.yml` which references the `Dockerfile` found
in the root directory of the project.

**Note:** the secrets file is required to run the app which is not on github.
Sample secrets file is provided as `.env.default`:
```
$ cp .env.default .env
```

Run the *production deploy* using:
```
$ mvn package # creates jar in target directory
$ docker-compose up -d
```

`docker-compose up -d` will create a detached docker container session. It will download images the first 
time you run it.

You should be able to access the site at: http://localhost:8080

---

# TODO

- Secure the app with SSL cert