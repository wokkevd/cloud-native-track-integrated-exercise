# Cloud Native Track - Integrated Exercise

## Goal

The goal of this exercise is to put everything you have learned these 2 days in 
practice.  The workshops should have prepared you most of the exercise, however 
you might have to do some Googling yourself as well.

## Exercise

Fork this repo, and put all your code in there.  This is very open exercise, 
there are only a couple of requirements:

1. you will need to write your own Dockerfile (obviously according to all best 
practices and with a minimal size)

2. application is not the focus, should be a very simple "hello world" (but some 
dynamic configuration should be possible, see next point)

3. put some config/secrets in configmaps/secrets

4. everything should be deployable using a single YAML:

```
oc apply -f your_yaml_file.yaml
```

5. any changes pushed to your GitHub repository should trigger a new build and 
deploy

Once you are ready, post the link to you fork in the Slack channel so everybody 
else can try to run you appliction!

## Resources

Some useful resources:

* OpenShift docs: https://docs.openshift.com
* Kubernetes website: https://kubernetes.io/docs/home/
* Kubernetes API: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.13/