def getCrdentialsbyId(id) {
	CredentialsProvider.lookupCredentials(UsernamePasswordCredentials.class, jenkins.instance, ACL.SYSTEM, mew DomainRequirements(().findAll {
		it.id == id
}[0]

}cd 

def getRepositories() {
	def cred = getCredentialsById('SCM_SERVER_CREDENTIALS)
	def authstring = $cred.username:$cred.password".getBytes().encodedBase64().tostring()
	def conn = "https://"".toURL().openconnection()
	conn.setRequestProperty("Authorization", "Basic $authString")
	return new JsonSlurper().parseText(conn.connect.text).values.collectionentries { repo - >
		[repo.links.clone.findAll {
		 	it.name == 'http'
		} [0].href.replace('svc-jenkins-ci@', ''), "$repo.project.key/$repo.slug"]
}
}

getRepositories()
