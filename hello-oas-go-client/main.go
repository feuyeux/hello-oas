package main

import (
	"context"

	log "github.com/sirupsen/logrus"

	"github.com/feuyeux/hello-oas/hello"
)

func main() {
	client := hello.NewAPIClient(hello.NewConfiguration())
	client.ChangeBasePath("http://localhost:8080/")

	greetings, response, err := client.DefaultApi.SayGreetings(context.Background(), 1, hello.HELLO_What)
	if err != nil {
		log.Errorf("did not connect: %v", err)
	}
	if response != nil {
		greeting := greetings[0]
		saying := greeting.Value
		log.Infof("%s,%s,%s %d,%s,%v", greeting.Id, greeting.Yours, greeting.Mine, saying.Id, saying.Name, saying.Values)
	}
}
