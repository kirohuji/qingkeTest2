package NettyTest;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class HelloServer {
	private static final int portNumber=7878;
	public static void main(String[] args){
		EventLoopGroup bossGroup=new NioEventLoopGroup();
		EventLoopGroup workerGroup=new NioEventLoopGroup();
		try{	
			ServerBootstrap b=new ServerBootstrap();
			b.group(bossGroup,workerGroup);
			b.channel(NioServerSocketChannel.class);
			b.childHandler(new HelloServerInitializer());
		}finally{
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}
}
