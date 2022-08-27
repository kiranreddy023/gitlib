def call(id,user,ip,war){
    sshagent([id]){
    sh "scp -o StrictHostKeyChecking=no target/${war} ${user}@${ip}:/opt/tomcat/webapps"
    sh "ssh ${user}@${ip} /opt/tomcat/bin/startup.sh"
    
    }
}
