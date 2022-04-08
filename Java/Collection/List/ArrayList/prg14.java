import java.util.*;

class Instagram {

	public static void main(String[] args) {
		
		ArrayList<Integer> followers = new ArrayList<Integer> ();

		followers.add(11); 
		followers.add(12);
		followers.add(13);
		followers.add(11);
		followers.add(14);
		followers.add(13);

		ArrayList<Integer> blockList = new ArrayList<Integer> ();

		blockList.add(11);
		blockList.add(13);

		ArrayList<Integer> newFollowers = new ArrayList<Integer> ();

		Iterator followerIterator = followers.iterator();
		Iterator blockListIterator = blockList.iterator();

		while(followerIterator.hasNext()) {

			int flag = 0;
			int follower = (Integer)followerIterator.next();

			while(blockListIterator.hasNext()) {

				int blocked = (Integer)blockListIterator.next();

				if(blocked == follower) {

					flag = 1;
				}
			}

			if(flag == 0) {

				newFollowers.add(follower);
			}
		}

		System.out.println(newFollowers);
	}
}